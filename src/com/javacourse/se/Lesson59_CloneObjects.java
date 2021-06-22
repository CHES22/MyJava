package com.javacourse.se;

public class Lesson59_CloneObjects {
    public void DoMethod() throws CloneNotSupportedException {

        MyObject myObject = new MyObject();
        myObject.i = 1;
        MyObject myObject1 = myObject.clone();
        myObject.i = 2;
        System.out.println(myObject.i);
    }
}

/* Клонирование бывает поверхностное и глубокое
необходимо имплиментить Cloneable и заоверрайдить метод Clone();
 */

class MyObject implements Cloneable {
    int i;

    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        return (MyObject) super.clone();
    }
}