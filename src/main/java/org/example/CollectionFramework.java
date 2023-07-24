package org.example;

import java.util.*;

class Book
{
    int id;
    String name, author, publisher;
    int quantity;

    Book(int id, String name, String author, String publisher, int quantity)
    {
        this.id = id;
        this.name=  name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class CollectionFramework {
    public static void main(String[] args) {
        System.out.println("ArrayList Implementation below:................");
        List<Book> list = new ArrayList<>();
        Book b1 = new Book(101, "abcdef", "Paulo", "Horizon", 200);
        Book b2 = new Book(102, "Friend", "Khaled", "Riverhead", 110);
        Book b3 = new Book(103, "Hellow", "Chetan", "NewIndia", 150);

        //Adding Books to the list
        list.add(b1);
        list.add(b2);
        list.add(b3);

        //traversing list
        for (Book b:list
             ) {
            System.out.println(b.id+" "+b.name+" "+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        System.out.println();

        System.out.println("Linked List Implementaion below:.................");
        List<Book> list1 = new LinkedList<>();
        Book b4 = new Book(101, "Harry", "Rabin", "Horizon", 100);
        Book b5 = new Book(102, "Princ", "Justin", "Riverhead", 150);
        Book b6 = new Book(103, "Gonee", "Krihs", "NewIndia", 140);

        list1.add(b4);
        list1.add(b5);
        list1.add(b6);

        for (Book c: list1
             ) {
            System.out.println(c.id+" "+c.name+"   " + "  "+" "+ c.author+" "+ " " +c.publisher+" "+ " " + c.quantity);
        }
        System.out.println();
        System.out.println("HashSet Implementation below:................");

        HashSet <Book> set= new HashSet<Book>();
        Book b8 = new Book(101, "Harry", "Rabin", "Horizon", 100);
        Book b9 = new Book(102, "Princ", "Justin", "Riverhead", 150);
        Book b11 = new Book(103, "Gonee", "Krihs", "NewIndia", 140);
       //Adding books to HashSet
        set.add(b8);
        set.add(b9);
        set.add(b11);
        //Traversing HashSet
        for (Book d: set) {
            System.out.println(d.id+" "+d.name+"   " + "  "+" "+ d.author+" "+ " " +d.publisher+" "+ " " + d.quantity);
        }

        System.out.println();
        System.out.println("LinkedHashSet Implementation Below:..........");
        LinkedHashSet <Book> hs = new LinkedHashSet<>();
        Book c1 = new Book(101, "abcdef", "Paulo", "Horizon", 200);
        Book c2 = new Book(102, "Friend", "Khaled", "Riverhead", 110);
        Book c3 = new Book(103, "Hellow", "Chetan", "NewIndia", 150);
        hs.add(c1);
        hs.add(c2);
        hs.add(c3);

        for (Book c:hs) {
            System.out.println(c.id+" "+c.name+"   " + "  "+" "+ c.author+" "+ " " +c.publisher+" "+ " " + c.quantity);
        }

        System.out.println();
        System.out.println("Stack Implementation below:............");
        Stack <Book> stack = new Stack<>();
        Book s1 = new Book(101, "abcdef", "Paulo", "Horizon", 200);
        Book s2 = new Book(102, "Friend", "Khaled", "Riverhead", 110);
        Book s3 = new Book(103, "Hellow", "Chetan", "NewIndia", 150);
        stack.add(s1);
        stack.add(s2);
        stack.add(s3);

        for (Book s:stack
             ) {
            System.out.println(s.id+" "+s.name+"   " + "  "+" "+ s.author+" "+ " "+ s.publisher+" "+ " " + s.quantity);
        }

    }
}
