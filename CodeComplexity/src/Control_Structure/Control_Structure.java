package Control_Structure;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Chamal PC
 */

public class Control_Structure {
    
    // Get controller code segment from the line (Java) 
    public String getControllerCodeSegment(String statement){
      String codeSegment = "";
      Matcher findIf = Pattern.compile("^[ \\t]*if *.*").matcher(statement);
      Matcher findFor = Pattern.compile("^[ \\t]*for *.*").matcher(statement);
      Matcher findWhile = Pattern.compile("^[ \\t]*while *.*").matcher(statement);
      //Matcher findDoWhile = Pattern.compile("^[ \\t]*do *.*").matcher(statement);
      Matcher findSwitch = Pattern.compile("^[ \\t]*switch *.*").matcher(statement);
      Matcher findSwitchCase = Pattern.compile("^[ \\t]*case *.*").matcher(statement);
      if (findIf.find()) {
         codeSegment = findIf.group();
      } else if (findFor.find()){
         codeSegment = findFor.group();
      } else if (findWhile.find()){
         codeSegment = findWhile.group();
      } else if (findSwitch.find()){
         codeSegment = findSwitch.group();
      } else if (findSwitchCase.find()){
         codeSegment = findSwitchCase.group();
      }
      return codeSegment;
    }
    
    // Get control structure type from the line (Java) 
    public String getControlStructureType(String statement){
      String codeType = "";
      Matcher findIf = Pattern.compile("^[ \\t]*if *.*").matcher(statement);
      Matcher findFor = Pattern.compile("^[ \\t]*for *.*").matcher(statement);
      Matcher findWhile = Pattern.compile("^[ \\t]*while *.*").matcher(statement);
      //Matcher findDoWhile = Pattern.compile("^[ \\t]*do *.*").matcher(statement);
      Matcher findSwitch = Pattern.compile("^[ \\t]*switch *.*").matcher(statement);
      Matcher findSwitchCase = Pattern.compile("^[ \\t]*case *.*").matcher(statement);
      if (findIf.find()) {
         codeType = "if";
      } else if (findFor.find()){
         codeType = "for";
      } else if (findWhile.find()){
         codeType = "while";
      } else if (findSwitch.find()){
         codeType = "switch";
      } else if (findSwitchCase.find()){
         codeType = "case";
      }
      return codeType;
    }
    
    // Get closing tag count (Java) 
    public int numberOfClosingTags(String statement){
        int numberOfClosing = 0;
        Matcher findClosing = Pattern.compile("[ \\t]*\\}").matcher(statement);
         while(findClosing.find()){
            numberOfClosing++;
        }
        return numberOfClosing;
    }

    // Get opening tag count (Java)
    public int numberOfOpeningTags(String statement) {
        int numberOfOpening = 0;
        Matcher findOpening = Pattern.compile("[ \\t]*\\{[ \\n]*").matcher(statement);
        while(findOpening.find()){
            numberOfOpening++;
        }
        return numberOfOpening;
    }
    
    // Assign the weight that mannually input (Java)
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
            case "switch":
                wtcs = switchWeight;
                break;
            case "case":
                wtcs = caseWeight;
                break;
        }
        return wtcs;
    }
    
    // Get the condition count (Java)
    public int getNumberOfConditions(String codeStatement) {
        int totalConditions = 0;
        Matcher findConditions = Pattern.compile("(>|<|<=|>=|==|!=)").matcher(codeStatement);
        while(findConditions.find()){
            totalConditions++;
        }
        return totalConditions == 0 ? 1 : totalConditions;
    }
    
}
