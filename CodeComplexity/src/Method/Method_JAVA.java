package Method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.sound.midi.Soundbank;



public class Method_JAVA {
    
    ArrayList<String> lines;
    ArrayList<Integer> CmUnit;
    ArrayList<Integer> WPCRT;
    ArrayList<Integer> NCRT;
    ArrayList<Integer> VOID;
    ArrayList<Integer> NPDTP;
    ArrayList<Integer> NCDTP;
    ArrayList<String> tokens;
    ArrayList<String> matcherP1;
    ArrayList<String> matcherP2;
    ArrayList<String> matcherP3;
     
     int NPRT_WEIGHT ;
     int NCRT_WEIGHT ;
     int VOID_WEIGHT ;
     int NPDTP_WEIGHT ;
     int NCDTP_WEIGHT ;
     
  
    String P_Return_REGEX = "(public|private|protected)( byte| short | int| long| float | double | boolean | char)(.*?)(\\))";
    String C_Return_REGEX = "((?!((public class)(.*?)(\\)|\\{))|((public|private|protected|public static|private static |protected static)( void| byte| short | int| long| float | double | boolean | char)(.*?)(\\))))((public|private|protected)(.*?)(\\)|\\{|\\})))";
    String Parameter_1_REGEX =  "(?<=private |public |protected )(.*?)(\\))";
    String Parameter_2_REGEX = "(?<=\\().+?(?=\\))";
    String Parameter_3_REGEX = "\\b(\\w*(byte |short |int |long |float |double |boolean |char )\\w*)\\b";
			 
   public Method_JAVA (ArrayList<String> lines, int NPRT_W, int NCRT_W, int VOID_W, int NPDTP_W, int NCDTP_W){
       
         NPRT_WEIGHT = NPRT_W;
         NCRT_WEIGHT = NCRT_W;
         VOID_WEIGHT = VOID_W;
         NPDTP_WEIGHT = NPDTP_W;
         NCDTP_WEIGHT = NCDTP_W;
         
          System.out.println(NPRT_WEIGHT);
        System.out.println(NCRT_WEIGHT);
        System.out.println(VOID_WEIGHT);
        System.out.println(NPDTP_WEIGHT);
        System.out.println(NCDTP_W);
        
         
        this.lines = lines;
        tokens = new ArrayList<>(Collections.nCopies(lines.size(), ""));
        CmUnit = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        WPCRT = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NCRT = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        VOID = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NPDTP = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NCDTP = new ArrayList<>(Collections.nCopies(lines.size(), 0));
       
       CalculateCM();
       
   }
   
   public Method_JAVA (ArrayList<String> lines){
       
        this.lines = lines;
        tokens = new ArrayList<>(Collections.nCopies(lines.size(), ""));
        CmUnit = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        WPCRT = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NCRT = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        VOID = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NPDTP = new ArrayList<>(Collections.nCopies(lines.size(), 0));
        NCDTP = new ArrayList<>(Collections.nCopies(lines.size(), 0));
       
       CalculateCM();
       
   }

    private void CalculateCM() {
         for (int i = 0; i < lines.size(); i++) {
            CalculateWPCRT(lines.get(i), i);
  //          CalculateNCRT(lines.get(i), i);
            CalculateNPDTP(lines.get(i), i);
            CalculateNCDTP(lines.get(i), i);
        }
        CalculateTotal();
    }

    //.........................................................................
    //................RETURN TYPE CALCULATION..................................
    
    private int CalculateWPCRT(String line, int lineNo) {
        Pattern p_pattern = Pattern.compile(P_Return_REGEX);
        Matcher p_matcher = p_pattern.matcher(line);
        
        Pattern c_pattern = Pattern.compile(C_Return_REGEX);
        Matcher c_matcher = c_pattern.matcher(line);
        
        int premitive = 0;
        int composite = 0;
        int count =0;
        while (p_matcher.find()) {
            premitive++;
            AddToken(p_matcher.group(), lineNo);
        }
        
        while (c_matcher.find()) {
            composite++;
            AddToken(c_matcher.group(), lineNo);
        }
        
        count = (premitive*NPRT_WEIGHT) + (composite*NCRT_WEIGHT);
        
        WPCRT.set(lineNo, count);
        return count;
    }

    //.........................................................................
    //................PREMITIVE PARAMETER CALCULATION..................................
    
    private int CalculateNPDTP(String line, int lineNo) {
        Pattern pattern_1 = Pattern.compile(Parameter_1_REGEX);
        Matcher matcher_1 = pattern_1.matcher(line);
        
        int count = 0;
        while (matcher_1.find()) {
            
            
            String match = matcher_1.group();
   //         System.out.println(match);
//            matcherP1.add(matcher_1.group());
//            matcherP1.add(matcher_1.group());
//            
            Pattern pattern_2 = Pattern.compile(Parameter_2_REGEX);
            Matcher matcher_2 = pattern_2.matcher(match);
            
            while (matcher_2.find()){
                String match2 = matcher_2.group();
    //            System.out.println(match2);
                
                Pattern pattern_3 = Pattern.compile(Parameter_3_REGEX);
                Matcher matcher_3 = pattern_3.matcher(match2);
                
                while(matcher_3.find()){
                    count++;
                    AddToken(matcher_3.group(), lineNo);

                }
            }  
        }
        NPDTP.set(lineNo, count);
        return count;
    }

    //.........................................................................
    //................COMPOSITE TYPE CALCULATION..................................
    
    private int CalculateNCDTP(String line, int lineNo) {
        Pattern pattern_1 = Pattern.compile(Parameter_1_REGEX);
        Matcher matcher_1 = pattern_1.matcher(line);
        
        int count = 0;
        while (matcher_1.find()) {
            String match = matcher_1.group();
            
            Pattern pattern_2 = Pattern.compile(Parameter_2_REGEX);
            Matcher matcher_2 = pattern_2.matcher(match);
            
            while (matcher_2.find()){
                String match2 = matcher_2.group();
                
                Pattern pattern_3 = Pattern.compile(Parameter_3_REGEX);
  //              System.out.println(match2);
                String[] split1 = match2.split(",");
               
                for(int b = 0; b < split1.length ; b++){
 //                System.out.println(split1[b]);
                 Matcher matcher_3 = pattern_3.matcher(split1[b]);
                  
                    if(matcher_3.find()==false){
                         count++;
  //                       AddToken(matcher_3.group(), lineNo);
                     }else{
                        
                     }
                }
            }  
        }
        
  
        
        NCDTP.set(lineNo, count);
        return count;

    }
    
    //.........................................................................
    //................TOTAL CALCULATION..................................
    
  
    private void CalculateTotal() {
        
       
        System.out.println( NCDTP);
        
            for (int i = 0; i < CmUnit.size(); i++) {
            int total = (WPCRT.get(i) +( (NPDTP.get(i) * NPDTP_WEIGHT) + (NCDTP.get(i) * NCDTP_WEIGHT)));
            CmUnit.set(i, total);
        }
    }
           
    private void AddToken(String token, int index) {
        if (tokens.get(index).matches("")) {
            tokens.set(index, token);
        } else {
            tokens.set(index, tokens.get(index) + "," + token);
        }
    }
    
    public ArrayList<Integer> getWPCRT(){
        return WPCRT;
    }
    
    public ArrayList<Integer> getNPDTP(){
        return NPDTP;
    }

    public ArrayList<Integer> getNCDTP(){
        return NCDTP;
    }
    
    public ArrayList<Integer> getCM(){
        return CmUnit;
    }
    
}
