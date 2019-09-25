/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Neha
 */
public class Remove_Capitalization {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File fileDir1 = new File("C:\\Users\\Neha\\Desktop\\SA files\\reviews.txt");
	BufferedReader in2 = new BufferedReader(new InputStreamReader((InputStream)new FileInputStream(fileDir1)));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Neha\\Desktop\\SA files\\RC.txt")));
	String s = null;
        while ((s = in2.readLine()) != null) 
        {
            out.println(s.toLowerCase());
        }
        out.close();
        in2.close();
        System.out.println("Capitalization Removed.");
        Remove_Punctuation.main(null);
    }
    
}
