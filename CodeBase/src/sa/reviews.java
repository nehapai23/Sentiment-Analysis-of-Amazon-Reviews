/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Neha
 */
package sa;

import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class reviews {
    public static void main(String[] args) throws IOException {
    //Document doc = Jsoup.connect("https://www.amazon.com/Samsung-XE303C12-A01US-Chromebook-Wi-Fi-11-6-Inch/dp/B009LL9VDG/ref=sr_1_1?ie=UTF8&qid=1366683807&sr=8-1&keywords=laptop").userAgent("Chrome/56.0.2924.87").get();
    Document doc = Jsoup.connect("http://www.amazon.in/Moto-Plus-4th-Gen-White/dp/B01DDP85BY/ref=sr_1_1?ie=UTF8&qid=1489776512&sr=8-1&keywords=moto+g5+plus").timeout(10*1000).userAgent("Chrome/56.0.2924.87").get();
    String title = doc.title();
    PrintWriter writer = new PrintWriter("C:\\Users\\Neha\\Desktop\\SA files\\reviews.txt", "UTF-8");
    Element reviews = doc.getElementById("customer-reviews_feature_div");
    System.out.println(reviews.text());
    writer.println(reviews.text());
    writer.close();
    Remove_Capitalization.main(null);
    }
}


