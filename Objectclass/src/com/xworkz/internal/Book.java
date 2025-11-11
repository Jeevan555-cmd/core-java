package com.xworkz.internal;

public class Book {


        public String title;
        public String author;
        public int pages;
        public double price;
        public boolean isHardcover;

        public Book(String title, String author, int pages, double price, boolean isHardcover) {
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.price = price;
            this.isHardcover = isHardcover;
            System.out.println("It is All args Constructor");
        }

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            System.out.println("It is 2 args Constructor");
        }

        public Book() {
            System.out.println("It is no args Constructor");
        }

        @Override
        public String toString() {
            return "{Title:" + title + ", Author:" + author + ", Pages:" + pages + ", Price:" + price + ", Hardcover:" + isHardcover + "}";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj instanceof Book) {
                Book b = (Book) obj;
                return this.title.equals(b.title) &&
                        this.author.equals(b.author) &&
                        this.pages == b.pages &&
                        this.price == b.price &&
                        this.isHardcover == b.isHardcover;
            }
            return false;
        }

        @Override
        public int hashCode() {
            int prime = 7;
            int result = 1;
            result = prime * result + pages;
            return result;
        }
    }


