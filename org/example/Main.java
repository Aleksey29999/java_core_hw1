package org.example;

import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String file = "hellow.txt";
        String text = "Hello world!";

        Date date = new Date();
        Write Writer = new Write(file);

        Text text1 = new Text(text);

        Writer.write( text1 + date.toString() + "\n");
        System.out.println(text1 + date.toString());
    }
}





