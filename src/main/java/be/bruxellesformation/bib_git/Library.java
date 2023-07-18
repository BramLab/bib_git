package be.bruxellesformation.bib_git;

import java.time.LocalDateTime;
import java.util.*;

public class Library {

    List<Book> books;
    List<User> users;
    List <Borrowing> borrowings;

    public Library() {
        books = new ArrayList<Book>();
        books.add(new Book(1, "Harry Potter and the Cursed Child", "J.K. Rowling"));
        books.add(new Book(2, "The Christie Affair", "Nina de Gramont"));

        users = new ArrayList<User>();
        users.add(new User(1, "Salim", 101, "Gujurat State"));
        users.add(new User(2, "Aymane", 2, "Brussels City"));
        users.add(new User(3, "Bram", 100, "HellHole Molenbeek"));

        borrowings = new ArrayList<Borrowing>();
    }

    public void addBook(String bookName, String autName){
        //Book bookWithHighestBookId = books.stream().max(Comparator.comparing(v -> v.getBookId())).get(); // googled
        Book bookWithHighestBookId = books.stream().max(Comparator.comparing(Book::getBookId)).get();    // googled
        books.add(new Book(bookWithHighestBookId.getBookId()+1, bookName, autName));
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
        boolean found = false;
        Iterator<Book> itBook = books.iterator();
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
        Iterator<Book> itBook = books.iterator();
        while (itBook.hasNext()) {
            Book book = itBook.next();
            System.out.println(book);
        }
    }

    public boolean borrowBook(int bookId, int userId){
        boolean foundBook = false;
        boolean foundUser = false;
        Book book = null;
        User user = null;

        Iterator<Book> itBook = books.iterator();
        while (itBook.hasNext() && !foundBook) {
            book = itBook.next();
            if (book.getBookId() == bookId){
                foundBook = true;
            }
        }

        Iterator<User> itUser = users.iterator();
        while (itUser.hasNext() && !foundUser) {
            user = itUser.next();
            if (user.getUserId() == userId){
                foundUser = true;
            }
        }

        if (foundUser && foundBook) {
            borrowings.add(new Borrowing(user, book, LocalDateTime.now()));
            return true;
        }
        else return false;
    }

    public boolean returnBook(int bookId){
        //todo returnBook
        return false;
    }

}