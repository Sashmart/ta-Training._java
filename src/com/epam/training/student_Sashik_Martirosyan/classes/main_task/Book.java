package com.epam.training.student_Sashik;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public static void main(String[] args) {
     BookName book1=new BookName("Anlreli Zangakatun","Paruyr Sevak","Edit print","1954",
             256,2500,"prose");
     BookName book2=new BookName("Ashun","Exishe Charenc","Ovset","1932",
                256,2500,"prose");
     BookName book3=new BookName("Mayrikis","Paruyr Sevak","Ovset","1960",
                256,2500,"prose");
     BookName book4=new BookName("Anurjner","Exishe Charenc","Edit print","1974",
                256,2500,"prose");
      BookList bookList=new BookList();
       BookList.add(book1);
       bookList.add(book2);
       bookList.add(book3);
       bookList.add(book4);
        bookList.yearOfPublication("1940");
        bookList.publisher("Edit print");
        bookList.thatAuthorBooks("Paruyr Sevak");
    }

    public static class BookList {
        private static List<BookName> bookList=new ArrayList();
            public static void  add(BookName b) {
                bookList.add(b);
            }public void thatAuthorBooks(String authorName){
                System.out.println("List of that author books "+ authorName);
                for (BookName ak:bookList) {
                    if(ak.getAuthor().equals(authorName))
                    System.out.println(ak.toString());

                }
            }public void publisher(String publishName){
            System.out.println("List of that publisher " +publishName);
            for (BookName ak:bookList) {
                if(ak.getPublisher().equals(publishName)){
                    System.out.println(ak.toString());
                }

            }
        }public void yearOfPublication(String yearOfPublication){
            System.out.println("List of Publication since that "+yearOfPublication);
            for (BookName ak:bookList) {
                if (Integer.parseInt(ak.getYearOfPublication())>Integer.parseInt(yearOfPublication)){
                    System.out.println(ak.toString());
                }

            }
        }
    }

    static class BookName {
        public static int nextid;
        private int id;
        private String bookName;
        public String author;
        public String publisher;
        public String yearOfPublication;
        private int numberOfPages;
        private int price;
        private String typeOfBindings;
        BookName(String bookName,String author,String publisher,String yearOfPublication,int numberOfPages,int price,
            String typeOfBindings){
            this. id=nextid++;
            this.bookName=bookName;
            this.author=author;
            this.publisher=publisher;
            this.yearOfPublication=yearOfPublication;
            this.numberOfPages=numberOfPages;
            this.price=price;
            this.typeOfBindings=typeOfBindings;

        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getNumberOfPages() {
            return numberOfPages;
        }

        public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getTypeOfBindings() {
            return typeOfBindings;
        }

        public void setTypeOfBindings(String typeOfBindings) {
            this.typeOfBindings = typeOfBindings;
        }

        public String getYearOfPublication() {
            return yearOfPublication;
        }

        public void setYearOfPublication(String yearOfPublication) {
            this.yearOfPublication = yearOfPublication;
        }

        @Override
        public String toString() {
            return "BookName{" +
                    "id=" + id +
                    ", bookName='" + bookName + '\'' +
                    ", author='" + author + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", yearOfPublication='" + yearOfPublication + '\'' +
                    ", numberOfPages=" + numberOfPages +
                    ", price=" + price +
                    ", typeOfBindings='" + typeOfBindings + '\'' +
                    '}';
        }
    }
}
