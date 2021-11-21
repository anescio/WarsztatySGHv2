package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class FileSaver {
    public void saveToFile(Student student){

        try {
            FileWriter myWriter = new FileWriter("students.txt");
            myWriter.write(student.toString());
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
