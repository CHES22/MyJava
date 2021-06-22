package com.javacourse.se;

public class Lesson57_InnerClasses {
    private int i = 5;

    public static void DoMethod() {
        Lesson57_InnerClasses lesson57_innerClasses = new Lesson57_InnerClasses();
        //lesson57_innerClasses.method();

    /*  Бывают обычные Inner классы, статические и Inner классы на уровне методов
        Обычные Inner классы имеют доступ ко всем полям верхнего класса. (Часто используемые)
        Статические классы имеют доступ только к статическим переменным.
        На уровне методов применяются довольно редко, много ограничений.
        Внутренние классы имеют доступ к privat переменным
        Без экземпляра внешнего класса, мы не можем создать экземпляр внутреннего
     */
        Inner inner = lesson57_innerClasses.new Inner();
        inner.method2();
    }


    void method() {
        Inner inner = new Inner();
        inner.method2();
    }

    class Inner {
        int k = 6;

        void method2() {
            System.out.println(i);
        }
    }
}
