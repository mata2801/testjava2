package main;

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException{
        ArrayList test = new ArrayList();

        try{
            FileReader fr = new FileReader("src/main/resources/tomandjerry.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                test.add(line);
            }
            for (int i = 0; i < test.size(); i++){
                System.out.println(test.get(i));
            }


        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}