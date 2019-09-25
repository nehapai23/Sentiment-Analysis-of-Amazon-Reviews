/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

/**
 *
 * @author Neha
 */
public class tagger {
    public static void main(String[] args) {
        String a = "Testing tagger how it works";
        MaxentTagger tagger =  new MaxentTagger("C:/Users/Neha/Desktop/SA files/tagger/english-left3words-distsim.tagger");
        String tagged = tagger.tagString(a);
        System.out.println(tagged);
    }
}
