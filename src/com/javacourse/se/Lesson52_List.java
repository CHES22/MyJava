package com.javacourse.se;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


// Коллекция List
public class Lesson52_List {
    public void DoMethod(){

        List list1 = new ArrayList(); //Работает на основании массива, при необходимости увеличивание размер массива (по умолчанию 10)
        List list2 = new Vector(); // Тоже самое что ArrayList, но синхронизированный
        List list3  = new LinkedList(); // Двунаправленный связанный список, который хранит (в виде нод) ссылки на следующий и предыдущий элемент.
                                        // Наследовал от очередей "peek" and "poll", удобно использоватьв  очередях и стеках FIFO, LIFO
        list1.add("5");
        list1.add("4");
        list1.add("3");
        list1.add("2");
        list1.add("1");
        list1.add("6");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(i);

        }
    }
}
