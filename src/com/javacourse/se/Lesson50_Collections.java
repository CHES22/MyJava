package com.javacourse.se;

import java.util.*;

public class Lesson50_Collections {
    public void DoMethod() {
        // Обычный массив
        int[] array = new int[15];

        // Коллекции пришли на смену массивам, имеют методы add, remove
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.remove("2");

        // Старый способ, уже не применяется
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Новый способ обхода коллекции
        for (Object o : collection) {
            System.out.println(o);
        }

        // Основные четыре вида коллекций
        // 1. List Работает по индексу
        List collection2 = new ArrayList();
        collection2.add("1");
        collection2.add("2");
        collection2.add("3");
        collection2.set(2, "5"); //Заменить
        collection2.add(1, "6"); // вставить
        for (int i = 0; i < collection2.size(); i++) {
            System.out.println(collection2.get(i));
        }

        // 2. Queue работа с очередью
        Queue collection3 = new PriorityQueue();
        collection3.offer("20");
        collection3.offer("21");
        collection3.offer("22");

        int k = collection3.size();
        for (int j = 0; j < k; j++) { // Перебираем очередь
            System.out.println(collection3.peek()); // Показываем
            collection3.poll(); // Показываем и удаляем
        }
        System.out.println("num of elements " + collection3.size());

        // 3. Выводит только уникальные значения
//        Set collection4 = new HashSet();      // Неупорядоченные (произвольно)
//        Set collection4 = new LinkedHashSet();  // Упорядоченные по добавлению add
        Set collection4 = new TreeSet();  // Сортированная коллекция
        collection4.add("31");
        collection4.add("32");
        collection4.add("33");
        collection4.add("35");
        collection4.add("33");

        for (Object o : collection4) {
            System.out.println(o);
        }

        // 5. Позволяет работать с объеками по ключу
        Map collection5 = new HashMap();
        collection5.put("1", new Book ("Sam Brown"));
        collection5.put("2", new Book ("Dail Karnegi"));
        collection5.put("3", new Book ("How match"));
//        System.out.println(collection5.get("2"));
        Set set = collection5.entrySet();
        for (Object o : set){
            System.out.println(o);
        }

    }
    class Book{
        String nameAutor;

        public Book(String nameAutor) {
            this.nameAutor = nameAutor;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "nameAutor='" + nameAutor + '\'' +
                    '}';
        }
    }
}

