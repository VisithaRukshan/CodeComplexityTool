/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class Variable_JAVA {

    ArrayList<String> lines;
    ArrayList<Integer> WVS;
    ArrayList<Integer> NPDTV;
    ArrayList<Integer> NCDTV;
    ArrayList<Integer> CV;
    int WVS_G_WEIGHT = 2;
    int WVS_L_WEIGHT = 1;
    int NPDTV_WEIGHT = 1;
    int NCDTV_WEIGHT = 2;

    String CBRACKET = "\\}";
    String OBRACKET = "\\{";

    ArrayList<Integer> startOfMethod = new ArrayList<>();
    ArrayList<Integer> endOfMethod = new ArrayList<>();

    //Variable Regex
    String VAL_REGEX = "\\b(?!private|public|protected)(?:\\w+\\s+)([\\w\\,\\s]+)(\\;|\\=)";
    //Primitive
    String NPDTV_REGEX = "\\b(byte|char|short|int|long|float|double|boolean|void)\\s+(\\w+).*?\\;";
    //Composite
    String NCDTV_REGEX = "\\b(?!private|public|protected)\\w+(\\s+|\\[.*\\]|\\<.*\\>)\\s*\\w+[\\w\\,\\s]*(\\=|\\;)";
    //Search Constrol Structure
    String CS_REGEX = "(for|while|do|if|,switch|case)\\s*\\(.*\\)\\s*\\{";
    //Parameters
    String PM_REGEX = "\\((.+)\\)\\s*\\{";
    //Find Method
    String METHOD_REGEX = "\\w+\\s+\\w+\\s*\\(.*?\\)\\s*\\{";

    public Variable_JAVA(ArrayList<String> lines) {
        this.lines = lines;
        WVS = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NPDTV = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NCDTV = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        CV = new ArrayList<>(Collections.nCopies(lines.size(), 0));

        FindFunctions();
        CalculateCV();
    }

    public Variable_JAVA(ArrayList<String> lines, int WVS_WG, int WVS_WL, int NPDTV_W, int NCDTV_W) {
        this.lines = lines;
        WVS = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NPDTV = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NCDTV = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        CV = new ArrayList<>(Collections.nCopies(lines.size(), 0));

        WVS_G_WEIGHT = WVS_WG;
        WVS_L_WEIGHT = WVS_WL;
        NPDTV_WEIGHT = NPDTV_W;
        NCDTV_WEIGHT = NCDTV_W;

        FindFunctions();
        CalculateCV();
    }

    private void CalculateCV() {
        for (int i = 0; i < lines.size(); i++) {
            CalculateWVS(lines.get(i), i);
            CalculateNPDTV(lines.get(i), i);
            CalculateNCDTV(lines.get(i), i);
        }
        CalculateTotal();
    }

    private int CalculateWVS(String line, int lineNo) {
        int count = 0;

        Pattern pattern = Pattern.compile(VAL_REGEX);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            Pattern CSpattern = Pattern.compile(CS_REGEX);
            Matcher CSmatcher = CSpattern.matcher(line);
            Pattern PMpattern = Pattern.compile(PM_REGEX);
            Matcher PMmatcher = PMpattern.matcher(line);

            if (!PMmatcher.find() && !CSmatcher.find()) {
                if (isLocal(lineNo)) {
                    count += WVS_L_WEIGHT;
                } else {
                    count += WVS_G_WEIGHT;
                }
            }
        }
        WVS.set(lineNo, count);
        return count;
    }

    private int CalculateNPDTV(String line, int lineNo) {
        int count = 0;

        Pattern pattern = Pattern.compile(NPDTV_REGEX);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            Pattern CSpattern = Pattern.compile(CS_REGEX);
            Matcher CSmatcher = CSpattern.matcher(line);
            Pattern PMpattern = Pattern.compile(PM_REGEX);
            Matcher PMmatcher = PMpattern.matcher(line);

            if (!PMmatcher.find() && !CSmatcher.find()) {
                String[] multiple = matcher.group().split("\\,");
                if (multiple.length > 0) {
                    for (String n : multiple) {
                        count++;
                    }
                } else {
                    count++;
                }
            }
        }

        NPDTV.set(lineNo, count);
        return count;
    }

    private int CalculateNCDTV(String line, int lineNo) {
        int count = 0;

        Pattern pattern = Pattern.compile(NCDTV_REGEX);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            Pattern CSpattern = Pattern.compile(CS_REGEX);
            Matcher CSmatcher = CSpattern.matcher(line);
            Pattern PMpattern = Pattern.compile(PM_REGEX);
            Matcher PMmatcher = PMpattern.matcher(line);

            if (!PMmatcher.find() && !CSmatcher.find() && CalculateNPDTV(line, lineNo) == 0) {
                String[] multiple = matcher.group().split("\\,");
                if (multiple.length > 0) {
                    for (String n : multiple) {
                        count++;
                    }
                } else {
                    count++;
                }
            }
        }

        NCDTV.set(lineNo, count);
        return count;
    }

    private boolean isLocal(int index) {
        boolean result = false;
        int startIndex = -1;
        for (int n : startOfMethod) {
            int nextIndex = startOfMethod.indexOf(n) + 1;
            int finalIndex = startOfMethod.indexOf(n) + 1;;
            if (nextIndex >= startOfMethod.size()) {
                nextIndex = startOfMethod.indexOf(n);
            }
            if (n <= index && (startOfMethod.get(nextIndex) > index || finalIndex >= startOfMethod.size())) {
                startIndex = startOfMethod.indexOf(n);
                break;
            }
        }
        if (startIndex != -1) {
            int endIndex = endOfMethod.get(startIndex);
            if (endIndex > index) {
                result = true;
            }
        }
        return result;
    }

    private void FindFunctions() {

        startOfMethod.clear();
        endOfMethod.clear();

        for (int i = 0; i < lines.size(); i++) {
            Pattern pattern = Pattern.compile(METHOD_REGEX);
            Matcher matcher = pattern.matcher(lines.get(i));
            if (matcher.find()) {
                startOfMethod.add(i);
                i = findEnd(i);
            }

        }
    }

    private int findEnd(int index) {
        int closedIndex = index;
        int bracketCount = 1;

        for (int i = index + 1; i < lines.size(); i++) {
            Pattern bracketOpenP = Pattern.compile(OBRACKET);
            Matcher bracketOpenM = bracketOpenP.matcher(lines.get(i));

            Pattern bracketCloseP = Pattern.compile(CBRACKET);
            Matcher bracketCloseM = bracketCloseP.matcher(lines.get(i));

            while (bracketOpenM.find()) {
                bracketCount++;
            }
            while (bracketCloseM.find()) {
                bracketCount--;
            }

            if (bracketCount <= 0) {
                endOfMethod.add(i);
                closedIndex = i;
                break;
            }
        }

        return closedIndex;
    }

    private void CalculateTotal() {
        for (int i = 0; i < CV.size(); i++) {
            int total = WVS.get(i) * (NPDTV.get(i) * NPDTV_WEIGHT + NCDTV.get(i) * NCDTV_WEIGHT);
            CV.set(i, total);
        }
    }

    public ArrayList<Integer> getCV() {
        return CV;
    }

    public ArrayList<Integer> getWVS() {
        return WVS;
    }

    public ArrayList<Integer> getNPDTV() {
        return NPDTV;
    }

    public ArrayList<Integer> getNCDTV() {
        return NCDTV;
    }

    public int getTotalCV() {
        int total = 0;

        for (int i = 1; i < CV.size(); i++) {
            total += CV.get(i);
        }

        return total;
    }
}
