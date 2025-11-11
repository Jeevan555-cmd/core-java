package com.xworkz.runner;

import com.xworkz.internal.Book;

public class BookRunner {

        public static void main(String[] args) {
            Book b1 = new Book("Atomic Habits", "James Clear", 320, 499.0, true);
            Book b2 = new Book("Atomic Habits", "James Clear", 320, 499.0, true);
            Book b3 = new Book();

            System.out.println(b1);
            System.out.println(b1.equals(b2));
            System.out.println(b1.hashCode());
            System.out.println(b2.hashCode());
        }
    }


