package com.javacourse.se;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Book {
    String autor;
    String name;
}

class Ticket {
    int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}


public class Lesson49_Equals_HashCode extends Object {
    public void DoMethod() {
        Ticket ticket = new Ticket();
        ticket.number = 123;

        Ticket ticket2 = new Ticket();
        ticket2.number = 123;
        Book book = new Book();
        book.autor = "Karnegy";
        book.name = "How to get friends";
        Map<Ticket, Book> library = new HashMap();
        library.put(ticket, book);

        //Book karnegiBook = library.get(book.name);
        Book karnegiBook = library.get(ticket2);
        System.out.println(karnegiBook.autor);



        //Book karnegiBook = library.get(ticket2);
        System.out.println(karnegiBook.autor);


    }
}
