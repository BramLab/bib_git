package be.bruxellesformation.bib_git;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("+------------------------------+");
        System.out.println("Welcome to our Book Application.");
        System.out.println("+------------------------------+");

        /*Book book1 = new Book(1, "Harry Potter and the Cursed Child", "J.K. Rowling");
//        Book book2 = new Book(2, "The Christie Affair", "Nina de Gramont");*/



        List<Book> books = new ArrayList<Book>();

        books.add(new Book(1, "Harry Potter and the Cursed Child", "J.K. Rowling"));
        books.add(new Book(2, "The Christie Affair", "Nina de Gramont"));


        //System.out.println(book1);
        List<Book> bookList = new ArrayList<Book>();

        //bookList.add(book2);
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        int ch;

        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("Enter Your Choice : ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Book Id : ");
                    int bookId = sc.nextInt();
                    System.out.println("Enter Book Name : ");
                    String bookName = sc2.nextLine();
                    System.out.println("Enter Book Author : ");
                    String autName = sc3.nextLine();

                    books.add(new Book(bookId,bookName,autName));

                    break;

                case 2:
                    System.out.println("+------------------------------------------------------------+");
                    //System.out.println(books);
                    //System.out.println(books);
                    Iterator<Book> itBook = books.iterator();
                    while (itBook.hasNext()) {
                        Book book = itBook.next();
                        System.out.println(book);
                    }
                    System.out.println("+------------------------------------------------------------+");

                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter Book Id to Search : ");
                    int bookIdSearch = sc.nextInt();
                    System.out.println("+------------------------------------------------------------+");
                    itBook = books.iterator();

                    while (itBook.hasNext()) {
                        Book book = itBook.next();
                        if (book.getBookId() == bookIdSearch) {
                            System.out.println(book);
                            found = true;
                        }
                        if (!found) {
                            System.out.println("Record Not Found .");
                        }
                        System.out.println("+------------------------------------------------------------+");
                        break;


                    }
                case 4 :
                    found = false;
                    System.out.println("Enter Book Id to Delete : ");
                    bookIdSearch = sc.nextInt();
                    System.out.println("+------------------------------------------------------------+");
                    itBook  = books.iterator();
                    while (itBook.hasNext()) {
                        Book book = itBook.next();
                        if (book.getBookId() == bookIdSearch){
                            itBook.remove();
                            found= true;
                        }

                    }
                    if(!found){
                        System.out.println("Record Not Found .");
                    } else{
                        System.out.println("Record is Deleted Successfully ..!");
                    }
                    System.out.println("+------------------------------------------------------------+");
                    break;

                case 5 :
                    found = false;
                    System.out.println("Enter Book Id to Update : ");
                    bookIdSearch = sc.nextInt();
                    System.out.println("+------------------------------------------------------------+");
                    ListIterator<Book> bookListIterator  = books.listIterator();
                    while (bookListIterator.hasNext()) {
                        Book book = bookListIterator.next();
                        if (book.getBookId() == bookIdSearch){

                            System.out.print("Enter new Book Id     : ");
                            int bookId2 = sc.nextInt();
                            System.out.print("Enter new Book Name   : ");
                            String bookName2 = sc2.nextLine();
                            System.out.print("Enter new Author Name : ");
                            String autName2 = sc3.nextLine();
                            bookListIterator.set(new Book(bookId2,bookName2,autName2));

                            found= true;
                        }

                    }
                    if(!found){
                        System.out.println("Record Not Found .");
                    } else{
                        System.out.println("Record is Updated2" +
                                " Successfully ..!");
                    }
                    System.out.println("+------------------------------------------------------------+");
                    break;
            }


        }
        while (ch != 0);


    }
}