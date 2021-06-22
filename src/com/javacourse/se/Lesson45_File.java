package com.javacourse.se;

import java.io.*;

/* 5 основных методов
        File
        FileReader
        FileWriter
        BufferedReader
        BufferedWriter
 */

public class Lesson45_File {

    public void Do_method() throws IOException {

        File file = new File("temp.txt");
        if (!file.exists())
            file.createNewFile(); // create file

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("str1 \n");
        fileWriter.flush();

        System.out.println("file exists");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str4");
        bufferedWriter.newLine();
        bufferedWriter.write("str5");
        bufferedWriter.flush();
        bufferedWriter.close();

        FileReader fileReader = new FileReader(file);
//        char[] chars = new char[20];
//        fileReader.read(chars);   так не делается !!!!!!!
//        System.out.println(chars);  Читает в массив, нужно знать размер файла

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
    }
}