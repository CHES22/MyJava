package com.javacourse.se;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// Comparable<Person> - для сортировки
// Если не получится имплементировать и оверайдить, то вариант 2
class Person implements Comparable<Person> {
    public Person(int age) {
        this.age = age;
    }

    // Обязательно оверайдим compareTo
    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }
// Приводим результат toString
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    int age;
}
// Вариант 2 Если не было возможности оверайдить
// Создаем свой класс, Имплиментим Компаратор, Оверрайдим.
class ComparePerson implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2){
        return o1.age - o2.age;
    }
}

public class Lesson51_Sort_Collections {
    public void DoMethod(){
        ComparePerson comparePerson = new ComparePerson();
        Set set = new TreeSet(comparePerson);
        set.add(new Person(5));
        set.add(new Person(3));
        set.add(new Person(4));
        set.add(new Person(1));
//        set.add("5"); // с int все просто
//        set.add("1");
//        set.add("4");
//        set.add("6");
//        set.add("3");

        for (Object o: set){
            System.out.println(o);
        }


    }
}
