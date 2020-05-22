package Coupling;



import Interface.Index;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Coupling_Group_pro
 * @author Dhanuka PC
 * IT18122442
 */
public class Recurtion {
    
    public static int recursiveCount = 0;
    public static ArrayList<Integer> countList1 = new ArrayList<>();
	
	public static void recursion() throws IOException {
		
      File file2;
            file2 = Index.f;
            
		String[] words=null;
		FileInputStream fstream = new FileInputStream(file2);
		  DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		  String strLine;
		  
		  int isString = 0;
		    String input1="public";   						
		    String input2="void";
		    String input3="(";
		    String input4="static";
		    String input5="int";
		    String input6="String";
		    String input7="float";
		    
		    int insideMethod = 1;
		    
		    String open = "{";
		    String closed = "}";
		    int bracket = 0;
		    int count1 = 0;
                    
                    
		    String methodName=null;
			
			while((strLine=br.readLine()) != null)
			{

				int k = 0;
				
				 words=strLine.split(" ");   //Split the word using space
				 
		         for(int i=0;i<words.length;i++)
		         { 
		            for(int j=0;j<words[i].length();j++)
		            {	       
		               char ch=words[i].charAt(j);   //Read the word char by char
		               if(ch == '"') {
		            	   isString = isString + 1;
		               }     
		            }
		         }
		         if(isString%2==0)
				 {
		        	 
		        	 if (strLine.contains(input1) && strLine.contains(input3) && (strLine.contains(input2) || strLine.contains(input5) || strLine.contains(input6) || strLine.contains(input7)))   //check for methods 					
	                 {
		        		 int l = 2;
		        		 String mName[]=null;
		        		 
		        		 if(strLine.contains(input4)) {
		        			 l++;
		        		 }

		        		 methodName = words[l];

		        		 insideMethod ++;     //incriments if inside a method
		        		 
		        		 if(strLine.contains(open)) {
		        			 bracket++;
		        		 }
		        		 if(strLine.contains(closed)) {
		        			 bracket--;
		        		 }
		        		 
	                   
	                 }
                                 count1 = 0;
		        	 
		        	 if(insideMethod == 0) {
		        		
		        		 
	        		 
		        		 if(bracket>0 && strLine.contains(methodName) && strLine.contains("(") && strLine.contains(")")) {		//if inside method and have recursion call recursiveCount will increment
		        			 recursiveCount++;
                                                 count1++;
	        			
		        		 }
	        		 
	        			 	//initializing for 0 in end of the method
		        	 }
		        	 
		        	insideMethod=0;	
		        	 k=count1;
		        	 
		        	 System.out.println(strLine+"                                "+k);
                                 countList1.add(k);
				 }
		         
			}
			
			System.out.println("count = "+ recursiveCount);
                        

		}
		public int getCr() {
				return recursiveCount;
		}
    
}
/**
 *Coupling_Group_pro
 * @author Dhanuka PC
 * IT18122442
 */