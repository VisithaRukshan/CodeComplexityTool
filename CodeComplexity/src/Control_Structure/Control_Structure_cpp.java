package Control_Structure;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Chamal PC
 */

public class Control_Structure_cpp {
    
    // Get control structure type from the line (C++)
    public String getControlStructureType(String statement){
      String codeType = "";
      Matcher findIf = Pattern.compile("^[ \\t]*if *.*").matcher(statement);
      Matcher findFor = Pattern.compile("^[ \\t]*for *.*").matcher(statement);
      Matcher findWhile = Pattern.compile("^[ \\t]*while *.*").matcher(statement);
      Matcher findDoWhile = Pattern.compile("^[ \\t]*do *.*").matcher(statement);
      Matcher findSwitch = Pattern.compile("^[ \\t]*switch *.*").matcher(statement);
      Matcher findSwitchCase = Pattern.compile("^[ \\t]*case *.*").matcher(statement);
      Matcher findDefault = Pattern.compile("^[ \\t]*default *:.*").matcher(statement);

      if (findIf.find()) {
         codeType = "if";
      } else if (findFor.find()){
         codeType = "for";
      } else if (findWhile.find()){
         codeType = "while";
      } else if (findDoWhile.find()){
         codeType = "dowhile";
      } else if (findSwitch.find()){
         codeType = "switch";
      } else if (findSwitchCase.find()){
         codeType = "case";
      } else if (findDefault.find()){
         codeType = "default";
      }
      return codeType;
    }
    
    // Get closing tag count (C++)
    public int numberOfClosingTags(String statement){
        int numberOfClosing = 0;
        Matcher findClosing = Pattern.compile("[ \\t]*\\}").matcher(statement);
         while(findClosing.find()){
            numberOfClosing++;
        }
        return numberOfClosing;
    }

    // Get opening tag count (C++)
    public int numberOfOpeningTags(String statement) {
        int numberOfOpening = 0;
        Matcher findOpening = Pattern.compile("[ \\t]*\\{[ \\n]*").matcher(statement);
        while(findOpening.find()){
            numberOfOpening++;
        }
        return numberOfOpening;
    }
    
    // Assign the weight that mannually input (C++)
    public int getWeight(String controlStructureType,int ifWeight, int iterateWeight, int switchWeight, int caseWeight){
        int wtcs = 0;
        switch (controlStructureType){
            case "if":
                wtcs = ifWeight;
                break;
            case "for":
                wtcs = iterateWeight;
                break;
            case "while":
                wtcs = iterateWeight;
                break;
            case "dowhile":
                wtcs = iterateWeight;
                break;
            case "switch":
                wtcs = switchWeight;
                break;
            case "case":
                wtcs = caseWeight;
                break;
        }
        return wtcs;
    }
    
    // Get the condition count (C++)
    public int getNumberOfConditions(String codeStatement) {
        int totalConditions = 0;
        Matcher findConditions = Pattern.compile("(>|<|<=|>=|==|!=)").matcher(codeStatement);
        while(findConditions.find()){
            totalConditions++;
        }
        return totalConditions == 0 ? 1 : totalConditions;
    }
}
