package com.javacourse.se;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class Lesson60_Reflection {
    public void DoMethod() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException {

// позволяет посмотреть все методы, все атрибуты, все аргументы, возвращаемые значения
        SomeClass someClass = new SomeClass();
        Class clss = someClass.getClass();
        System.out.println(clss);
        clss.getDeclaredConstructor();
        clss.getDeclaredFields();
        clss.getInterfaces();
        clss.getMethods();
        clss.getModifiers();


        Class clss2 = SomeClass.class;
        Class clss3 = Class.forName("com.javacourse.se.SomeClass");
        SomeClass someClass1 = (SomeClass) clss.newInstance();

        Constructor constructors = clss.getDeclaredConstructor();
        System.out.println(constructors.getName());
        Parameter[] parameters = constructors.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter.getName());
            System.out.println(parameter.getType().getName());
        }
    }


}

class SomeClass {
    private static transient int i;
    String s;

    public SomeClass() {
    }

    SomeClass(String s) {
        this.s = s;
    }

    public String someMethod(String s) {
        System.out.println("This is " + s);
        return s;
    }
}

