package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /*try {
            URL url = new URL("https://en.wikipedia.org/wiki/Wiki.txt");
            Scanner s = new Scanner(url.openStream());
            String statement = s.next();
            System.out.println(statement);
            // read from your scanner
        } catch (IOException ex) {
            // there was some connection problem, or the file did not exist on the server,
            // or your URL was not in the right format.
            // think about what to do now, and put it here.
            ex.printStackTrace(); // for now, simply output it.
        }*/
        Document doc = Jsoup.connect("http://www.cs.berkeley.edu/~tberg/papers/emnlp2012.pdf").get();
        String text = doc.body().text();
        String[] lines = text.split("\\.");
        int i = 1;
    }
}
