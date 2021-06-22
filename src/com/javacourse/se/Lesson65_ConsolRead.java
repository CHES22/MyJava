package com.javacourse.se;

import java.io.Console;
import java.util.Scanner;

public class Lesson65_ConsolRead {
    public void DoMethod() throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
//        Console console = System.console();
        String s = "";
        while (!s.equals("exit")) {
//            s = console.readLine();
            s = scanner.nextLine();
            System.out.println(s + " your self");
        }
        }
    }
