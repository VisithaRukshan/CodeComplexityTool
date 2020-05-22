/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Optimization;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Vishu PC
 */
public class optimizeCode {
 String OriginalCode = "";
    String OptimizedCode = "";
    ArrayList<String> Output;
    ArrayList<String> OriginalOutput;

    //Expressions for comments
    String CMT_EXP = "(\\/\\*[\\s\\S]*?\\*\\/)|((\\s*)\\/\\/.*)";
    //Expressions for import
    String IMPORT_EXP = "\\b(import)\\s+.+\\;";

    public optimizeCode(String path) throws FileNotFoundException, IOException {
        ArrayList<String> lines = new ArrayList();
        ArrayList<String> original = new ArrayList();

        InputStream is = new FileInputStream(path);
        BufferedReader buf = new BufferedReader(new InputStreamReader(is));
        String code = buf.readLine();
        StringBuilder sbuilder = new StringBuilder();
        while (code != null) {
            sbuilder.append(code).append("\n");
            code = buf.readLine();
        }
        OriginalCode = sbuilder.toString();
        String[] splitted = OriginalCode.split("\\r?\\n");
        for (String l : splitted) {
            original.add(l);
        }
        OriginalOutput = original;

        OptimizedCode = RemoveCmts(OriginalCode);
        OptimizedCode = RemoveImports(OptimizedCode);
        String[] codes = OptimizedCode.split("\\r?\\n");
        for (String l : codes) {
            lines.add(l);
        }
        Output = lines;
    }

    private String RemoveCmts(String code) {
        String out;
        out = code.replaceAll(CMT_EXP, "");
        return out;
    }

    private String RemoveImports(String code) {
        String out;
        out = code.replaceAll(IMPORT_EXP, "");
        return out;
    }

    public ArrayList<String> getOriginalCode() {
        return OriginalOutput;
    }

    public ArrayList<String> getOptimizedCode() {
        return Output;
    }   
}
