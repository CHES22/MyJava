package com.javacourse.se;

public class Lesson42_Exceptions {
    public void doMethod() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Вызов исключения IOException");
            //e.printStackTrace();
        } finally {
            System.out.println("То что срабатывает всегда");
        }
    }
}
