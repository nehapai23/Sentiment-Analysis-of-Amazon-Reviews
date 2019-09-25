/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Neha
 */
public class Stop_Word_Removal {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try
        	{
            	File file = new File("C:\\Users\\Neha\\Desktop\\SA files\\RP.txt");
            	Scanner input = new Scanner(file);
		PrintWriter writer = new PrintWriter("C:\\Users\\Neha\\Desktop\\SA files\\SWR.txt", "UTF-8");
                TreeSet<String> al=new TreeSet<String>();		
                BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Neha\\Desktop\\SA files\\Stopwords.txt")));
		String inputLine = null;
                while((inputLine = reader.readLine()) != null) 
		{
                    	al.add(inputLine);
                }
		reader.close();
		while(input.hasNext())
            	{
			String w = input.next();
			if(al.contains(w));
			else
				writer.println(w);
		}
		writer.close();
		}
        	catch (IOException e)
        	{
                	// do something
        	}
		System.out.println("Stop words removed");
        try {
            POSTagging.main(null);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Stop_Word_Removal.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
        
    }
    

