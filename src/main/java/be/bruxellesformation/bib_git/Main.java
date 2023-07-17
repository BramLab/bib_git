package be.bruxellesformation.bib_git;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("+------------------------------+");
        System.out.println("Welcome to our Book Application.");
        System.out.println("+------------------------------+");

        Book book1 = new Book(1,"Harry Potter and the Cursed Child","J.K. Rowling");
        Book book2 = new Book(2,"The Christie Affair","Nina de Gramont");

        System.out.println(book1);
        List<Book> bookList =  new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);
    }



}