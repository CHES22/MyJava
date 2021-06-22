package com.javacourse.se;

import java.util.*;

public class Lesson54_Maps {
    public void DoMethod(){

        // Четыре вида мапов
        Map map1=new HashMap(); // Значения хранятся по хэш-ключу в ноде, не упорядочен, храняться в том порядке, в котором их добавили.
        Map map2=new Hashtable(); // Тоже самое, только добавляется синхронность для многопоточности.
        Map map3=new LinkedHashMap(); // Тоже самое, только сортированный Red-Black алгоритм
        Map map4=new TreeMap();


        map1.put("1","one");
        map1.put("3","tree");
        map1.put("2","two");

        System.out.println(map1.get("3"));



    }
}
