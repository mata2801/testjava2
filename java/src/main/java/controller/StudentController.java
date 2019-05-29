package controller;

import entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> list = new ArrayList<Student>();
    public void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rollNumber: ");
        String rollNumber = scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        Student student = new Student(rollNumber, name);
        list.add(student);
    }
    public void writeFile() throws IOException {
        FileWriter fileWriter = new FileWriter("src/main/resources/myfile.txt");
        fileWriter.write("RollNumber \t"+ "Name\t" + "\n");
        for (Student student:
                list) {
            fileWriter.write(student.getRollNumber() + "       " + student.getName() + "\n");
        }
        fileWriter.close();
    }
    public void readFile()throws IOException{
        FileReader fileReader = new FileReader("src/main/resources/myfile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while( (line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }


    }
}
