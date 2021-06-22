package com.javacourse.se;

class Popcorn {
    void doSomthing() {
        System.out.println("popcorn");
    }
}


// Анонимные методы позволяют переопределять методы.
public class Lesson58_AnonimusClass {
    public void DoMethod() {
        Popcorn popcorn = new Popcorn() {
            void doSomthing() {
                System.out.println("main");
            }
        };
        popcorn.doSomthing();
    }
}
