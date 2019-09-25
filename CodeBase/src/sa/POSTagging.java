/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author Neha
 */
public class POSTagging {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        File file = new File("C:\\Users\\Neha\\Desktop\\SA files\\SWR.txt");
        Scanner input = new Scanner(file);
	PrintWriter writer = new PrintWriter("C:\\Users\\Neha\\Desktop\\SA files\\POS.txt", "UTF-8");
        MaxentTagger tagger =  new MaxentTagger("C:/Users/Neha/Desktop/SA files/tagger/english-left3words-distsim.tagger");
        PrintWriter writer1 = new PrintWriter("C:\\Users\\Neha\\Desktop\\SA files\\POS_filtered.txt", "UTF-8");

        while(input.hasNext())
        {
		String w = input.next();
                String tagged = tagger.tagString(w);
                String tag = tagged.substring(tagged.indexOf("_")+1);
                writer.println(tagged);

                if(tag.equals("JJ ")||tag.equals("JJR ")||tag.equals("JJS ")||tag.equals("RB ")||tag.equals("RBR ")||tag.equals("RBS ")||tag.equals("VB ")||tag.equals("VBD ")||tag.equals("VBG ")||tag.equals("VBN ")||tag.equals("VBP ")||tag.equals("VBZ ")||tag.equals("WRB "))
                {   
                    writer1.println(tagged);
                }
        }
        writer.close();
        writer1.close();
        System.out.println("POS Tagging done. Unwanted tags filtered.");
        Porter_Stemming.main(null);
    }
}
