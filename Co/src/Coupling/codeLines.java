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
public class codeLines {
    
    
    
    public static ArrayList<String> linesList = new ArrayList<>();
    
    
    
    public static void readLines() throws IOException {
		
        
       File file2;
            file2 = Index.f;
        
		String[] words=null;
		FileInputStream fstream = new FileInputStream(file2);
		  DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		  String strLine;
                  
                  while((strLine=br.readLine()) != null)
			{
                            linesList.add(strLine);
                        }
                  
                  
    
    }
    
}
/**
 *Coupling_Group_pro
 * @author Dhanuka PC
 * IT18122442
 */