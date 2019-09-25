/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Neha
 */
public class Afinn_SA {
    public static void main(String[] args) {
        int polarity = 0;
        try
        	{
            	File file = new File("C:\\Users\\Neha\\Desktop\\SA files\\SL.txt");
            	Scanner input = new Scanner(file);
		PrintWriter writer = new PrintWriter("C:\\Users\\Neha\\Desktop\\SA files\\Afinn_op.txt", "UTF-8");
            	Map<String, String> dictionary = new HashMap<String, String>();
		BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Neha\\Desktop\\SA files\\AFINN111.txt")));
		String inputLine;
                while((inputLine = reader.readLine()) != null) 
		{
                    	String key =  inputLine.substring(0,inputLine.indexOf(" "));
			String value = inputLine.substring(inputLine.indexOf(" ")+1);
			//System.out.println(key+":"+value);
			dictionary.put(key,value);
                }
		reader.close();
		while(input.hasNext())
            	{
			String w = input.next();
			if(dictionary.containsKey(w))
                        {
				writer.println(w+" "+dictionary.get(w));
                                polarity += Integer.parseInt(dictionary.get(w));
                        }else
				writer.println(w);
		}
                if(polarity>0)
                writer.println("Polarity = "+polarity);
                else if(polarity<0)
                writer.println("Polarity = "+polarity);
                else
                writer.println("Polarity = "+polarity);    
		writer.close();
		}
        	catch (IOException e)
        	{
                	// do something
        	}
		System.out.println("Polarity Calculated");
	}
    }

