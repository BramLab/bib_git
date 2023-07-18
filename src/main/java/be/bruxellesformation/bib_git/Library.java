package be.bruxellesformation.bib_git;

import java.util.*;

import be.bruxellesformation.bib_git.Book;

public class Library {

    List<Book> books;

    public Library() {
        books = new ArrayList<Book>();

        books.add(new Book(1, "Harry Potter and the Cursed Child", "J.K. Rowling"));
        books.add(new Book(2, "The Christie Affair", "Nina de Gramont"));
    }

    public void addBook(String bookName, String autName){
        Book bookWithHighestBookIdv1 = books.stream().max(Comparator.comparing(v -> v.getBookId())).get(); // googled
        //Book bookWithHighestBookIdv2 = books.stream().max(Comparator.comparing(Book::getBookId)).get();    // googled
        books.add(new Book(bookWithHighestBookIdv1.getBookId()+1, bookName, autName));
    }

    public void updateBook(int bookId, String bookName, String autName){
        ListIterator<Book> bookListIterator  = books.listIterator();
        while (bookListIterator.hasNext()) {
            Book book = bookListIterator.next();
            if (book.getBookId() == bookId){
                bookListIterator.set(new Book(bookId, bookName, autName));
            }
        }
    }

    public boolean deleteBook(int bookId){
        //todo deleteBook
        boolean found = false;
        Iterator<Book> itBook = books.iterator();
        itBook  = books.iterator();
        while (itBook.hasNext()) {
            Book book = itBook.next();
            if (book.getBookId() == bookId){
                itBook.remove();
                found= true;
            }
        }
        return found;
    }

    /* Chercher un livre (par auteur et nom en même temps)
    public Book searchBook(String author, String title){
        return null;// todo searchBook
    }*/

    public boolean searchBook(int bookId) {
        Iterator<Book> itBook = books.iterator();
        boolean found = false;

        while (itBook.hasNext()) {
            Book book = itBook.next();
            if (book.getBookId() == bookId) {
                System.out.println(book);
                found = true;
            }
        }
        return found;
    }

    public void showBooks(){
        //todo showBooks
        System.out.println("+------------------------------------------------------------+");
        Iterator<Book> itBook = books.iterator();
        while (itBook.hasNext()) {
            Book book = itBook.next();
            System.out.println(book);
        }
        System.out.println("+------------------------------------------------------------+");
    }


    public void lendBook(int bookId){
        //todo lendBook
    }

    public void returnBook(int bookId){
        //todo returnBook
    }

}