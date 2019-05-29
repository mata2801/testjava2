package test;

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        ArrayList test = new ArrayList();


        FileReader fileReader = new FileReader("src/main/resources/tomandjerry.txt");
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            if (count == 0) {
                {
                    count++;
                    continue;
                }
            }
            System.out.println(line);
            String[] splitted = line.split("\\s{2,}");
            if (splitted.length == 4) {
                String day = splitted[0];
                String id = splitted[1];
                String title = splitted[2];
                String view = splitted[3];
                System.out.println("day: " + day);
                System.out.println("id: " + id);
                System.out.println("title:" + title);
                System.out.println("view:" + view);
            }
            count++;
        }
    }
}