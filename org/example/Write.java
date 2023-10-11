package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
;
public class Write {

    String textFile;
    public String file = "hellow.txt";

    private FileWriter fileWriter;

    public Write(String file) { this.file= file ;
    }

    public void write(String text) throws IOException {

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(text);
        fileWriter.close();
    }
}











