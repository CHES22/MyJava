package com.javacourse.se;

public class Lesson56_Generics {
    public void DoMethod() {
        Lesson56_Generics main = new Lesson56_Generics();
        main.method(1);
    }


    /* 1. Дженерики работают только на этапе компиляции, в байткоде их не существует
       2. Позволяют принимать, передавать и хранить любой тип.
       3. Дженериками бывают методы и классы
       4. Не может быть статического дженерик типа
       5. Не можем создавать дженерик-массивы
       6. Проблема в том что у дженерик классов очень мало методов.
       https://www.youtube.com/watch?v=EvL0eO3VX14&list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX&index=56
     */

    /* Классы дженерики
    Поэтому их удобно использовать для хранения данных в коллекциях.
    Позволяет создавать коллекции любого типа
     */
    class generic<T, U> {
        T t;
        T genericMethod(T t, U u) {
            return t;
        }
    }





    <T> T method(T type) {
        System.out.println(type);
        return type;
    }
}
