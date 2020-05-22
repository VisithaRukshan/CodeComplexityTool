
package Size;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Vishu PC
 */
public class Size_JAVA {


    ArrayList<String> lines;
    ArrayList<Integer> CsUnit;
    ArrayList<Integer> NKW;
    ArrayList<Integer> NID;
    ArrayList<Integer> NNV;
    ArrayList<Integer> NOP;
    ArrayList<Integer> NSL;
    ArrayList<String> tokens;
    int NKW_WEIGHT = 1;
    int NID_WEIGHT = 1;
    int NNV_WEIGHT = 1;
    int NOP_WEIGHT = 1;
    int NSL_WEIGHT = 1;

    //NKW
    String NKW_REGEX_STRING = "(?<=\\W|\\b)(abstract|assert|break|catch|class|const|continue|default|else|extends|false|final|finally|goto|implements|import|instanceof|interface|native|new|null|package|private|protected|public|return|static|strictfp|super|synchronized|this|throw|throws|transient|true|try|void|volatile)(\\s|\\}|\\]|\\)|\\{|\\[|\\(|;)";
    //NID
    String NID_REGEX_STRING = "\\b(?!(abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|double|do|else|enu|extends|false|final|finally|float|for|goto|if|implements|import|instanceof|int|interface|long|native|new|null|package|private|protected|public|return|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|true|try|void|volatile|while)(\\(|\\)|\\[|\\]|\\{|\\}|\\<|\\>|\\s+)|\\d+)\\w+";
    //NNV
    String NNV_REGEX_STRING = "\\d+";
    //NOP
    String NOP_REGEX_STRING = "\\b(?<=\\w)\\.(?=\\w)|(\\,|\\-\\>|\\:\\:)|(\\>\\>\\>\\=|\\<\\<\\=|\\>\\>\\=|\\^\\=|\\|\\=|\\&\\=|\\%\\=|\\/\\=|\\*\\=|\\-\\=|\\+\\=|==|!=|>=|<=)|(&&|\\|\\||!)|(\\+\\+|\\-\\-|\\*|\\/|\\%|\\+|\\-)|(\\^|\\||\\~|\\<\\<\\<|\\>\\>\\>|\\>\\>|\\<\\<)|(=|>|<|&)";
    //NSL
    String NSL_REGEX_STRING = "\".*?\"";

    public Size_JAVA(ArrayList<String> lines) {
        this.lines = lines;
        tokens = new ArrayList<>(Collections.nCopies(lines.size(), ""));
        CsUnit = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NKW = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NID = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NNV = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NOP = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NSL = new ArrayList<>(Collections.nCopies(lines.size(), 0));

        CalculateCS();
    }

    public Size_JAVA(ArrayList<String> lines, int NKW_W, int NID_W, int NNV_W, int NOP_W, int NSL_W) {
        NKW_WEIGHT = NKW_W;
        NID_WEIGHT = NID_W;
        NNV_WEIGHT = NNV_W;
        NOP_WEIGHT = NOP_W;
        NSL_WEIGHT = NSL_W;
        this.lines = lines;
        tokens = new ArrayList<>(Collections.nCopies(lines.size(), ""));
        CsUnit = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NKW = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NID = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NNV = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NOP = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NSL = new ArrayList<>(Collections.nCopies(lines.size(), 0));

        CalculateCS();
    }

    private int CalculateNSL(String line, int lineNo) {
        Pattern pattern = Pattern.compile(NSL_REGEX_STRING);
        Matcher matcher = pattern.matcher(line);

        int count = 0;
        while (matcher.find()) {
            count++;
            AddToken(matcher.group(), lineNo);
        }
        NSL.set(lineNo, count);
        return count;
    }

    private int CalculateNOP(String line, int lineNo) {
        Pattern pattern = Pattern.compile(NOP_REGEX_STRING);
        Matcher matcher = pattern.matcher(line);

        int count = 0;
        while (matcher.find()) {
            count++;
            AddToken(matcher.group(), lineNo);
        }
        NOP.set(lineNo, count);
        return count;
    }

    private int CalculateNNV(String line, int lineNo) {
        Pattern pattern = Pattern.compile(NNV_REGEX_STRING);
        Matcher matcher = pattern.matcher(line);

        int count = 0;
        while (matcher.find()) {
            count++;
            AddToken(matcher.group(), lineNo);
        }
        NNV.set(lineNo, count);
        return count;
    }

    private int CalculateNID(String line, int lineNo) {
        //Search Declaration
        String DEC_REGEX = "\\b(?!private|public|protected)(?:\\w+\\s+)([\\w\\,\\s]+)(\\;|\\=)";
        //Search Constrol Structure
        String CS_REGEX = "(for|while|do|if|,switch|case)\\s*\\(.*\\)\\s*\\{";
        //Parameters
        String PM_REGEX = "\\((.+)\\)\\s*\\{";// alternative "\\(\\s*\\w+(\\s+|\\[.*\\]|\\<.*\\>)\\s*\\w+\\s*\\,{0,1}.*?\\)";

        Pattern pattern = Pattern.compile(NSL_REGEX_STRING);
        Matcher matcher = pattern.matcher(line);

        //Clear Lines of Strings and Parameters
        while (matcher.find()) {
            line = line.replace(matcher.group(), "");
        }
        pattern = Pattern.compile(PM_REGEX);
        matcher = pattern.matcher(line);
        while (matcher.find()) {
            Pattern pattern2 = Pattern.compile(CS_REGEX);
            Matcher matcher2 = pattern2.matcher(line);
            if (!matcher2.find()) {
                line = line.replace(matcher.group(1), "");
            }
        }
        //

        pattern = Pattern.compile(CS_REGEX);
        matcher = pattern.matcher(line);

        int count = 0;

        if (matcher.find()) {
            pattern = Pattern.compile(NID_REGEX_STRING);
            matcher = pattern.matcher(line);
            while (matcher.find()) {
                count++;
                AddToken(matcher.group(), lineNo);
            }
        } else {
            pattern = Pattern.compile(DEC_REGEX);
            matcher = pattern.matcher(line);
            if (matcher.find()) {
                line = line.replace(matcher.group(), "");
            }
            pattern = Pattern.compile(NID_REGEX_STRING);
            matcher = pattern.matcher(line);
            while (matcher.find()) {
                count++;
                AddToken(matcher.group(), lineNo);
            }

        }
        NID.set(lineNo, count);
        return count;
    }

    private int CalculateNKW(String line, int lineNo) {
        Pattern pattern = Pattern.compile(NKW_REGEX_STRING);
        Matcher matcher = pattern.matcher(line);

        int count = 0;
        while (matcher.find()) {
            count++;
            AddToken(matcher.group(1), lineNo);
        }
        NKW.set(lineNo, count);
        return count;
    }

    private void AddToken(String token, int index) {
        if (tokens.get(index).matches("")) {
            tokens.set(index, token);
        } else {
            tokens.set(index, tokens.get(index) + "," + token);
        }
    }

    private void CalculateCS() {
        for (int i = 0; i < lines.size(); i++) {
            CalculateNKW(lines.get(i), i);
            CalculateNNV(lines.get(i), i);
            CalculateNOP(lines.get(i), i);
            CalculateNSL(lines.get(i), i);
            CalculateNID(lines.get(i), i);
        }
        CalculateTotal();
    }

    private void CalculateTotal() {
        for (int i = 0; i < CsUnit.size(); i++) {
            int total = (NKW_WEIGHT * NKW.get(i)) + (NID_WEIGHT * NID.get(i)) + (NOP_WEIGHT * NOP.get(i)) + (NNV_WEIGHT * NNV.get(i)) + (NSL_WEIGHT * NSL.get(i));
            CsUnit.set(i, total);
        }
    }

    public ArrayList<Integer> getNKW() {
        return NKW;
    }

    public ArrayList<Integer> getNID() {
        return NID;
    }

    public ArrayList<Integer> getNNV() {
        return NNV;
    }

    public ArrayList<Integer> getNOP() {
        return NOP;
    }

    public ArrayList<Integer> getNSL() {
        return NSL;
    }

    public ArrayList<String> getTokens() {
        return tokens;
    }

    public ArrayList<Integer> getCS() {

        return CsUnit;
    }

    public int getTotalCS() {
        int total = 0;

        for (int i = 1; i < CsUnit.size(); i++) {
            total += CsUnit.get(i);
        }

        return total;
    }
}


