package com.javacourse.se;

import java.beans.Transient;
import java.io.*;

public class Lesson46_Serialize {
    public void doMethod() throws Exception {
        User user = new User();
        user.LifeLevel = 55;
        user.SecondParam = 22;
        user.NotSerializableParam = 33;

        FileOutputStream fileOutputStream = new FileOutputStream("tempFile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        //objectOutputStream.write(66);
        objectOutputStream.close();
        System.out.println("Записали");

        FileInputStream fileInputStream = new FileInputStream("tempFile.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser = (User) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.LifeLevel);
        System.out.println(newUser.SecondParam);
        System.out.println(newUser.NotSerializableParam); // получит занчение по умолчанию
        System.out.println("Прочитали");

    }

    public static class User implements Serializable {
        int LifeLevel;
        int SecondParam;
        transient int NotSerializableParam; // исключение из сериализации
    }

}