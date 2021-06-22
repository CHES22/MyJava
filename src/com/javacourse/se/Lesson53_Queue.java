package com.javacourse.se;

import java.util.*;

public class Lesson53_Queue {
    public void DoMethod() {
        Queue queue = new LinkedList(); // Хранит элементы в том порядке в котором они были добавлены, но можно исхитриться
        Queue queue1 = new PriorityQueue(); // Отсортирует очередь
        queue.add("1");       // Вызывает offer (тоже самое)
        queue.offer("3");  // Увеличивает массив, отсортировывает элемент при добавлении
        queue.add("2");
        queue.add("4");

        // Вот так можно отсортирвать LinkedList, но тоже костыль
              List list = (List) queue;
              Collections.sort(list);

        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }

    }
}
