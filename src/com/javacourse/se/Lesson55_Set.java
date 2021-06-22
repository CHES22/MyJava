package com.javacourse.se;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


// Выводит уникальные (не повторяющиеся значения)
public class Lesson55_Set {
    public void DoMethod() {

        Set set1 = new HashSet(); // На основани Map, выводится в любой последовательности. Нужно оверрайдить Equals и HashMap
        Set set2 = new LinkedHashSet(); // Упорядоченными, выводятся в той последовательности в которой задавались
        Set set3 = new TreeSet(); // Отсортированная
        set1.add("1");
        set1.add("3");
        set1.add("3");
        set1.add("4");
        set1.add("2");

        for (Object o:set1){
            System.out.println(o);
        }

    }
}
