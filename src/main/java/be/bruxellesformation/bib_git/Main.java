package be.bruxellesformation.bib_git;

import java.util.*;

public class Main {

    static Library library= new Library();
    public static void main(String[] args) {
        System.out.println("+------------------------------+");
        System.out.println("Welcome to our Book Application.");
        System.out.println("+------------------------------+");

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String ch;

        do {
            System.out.println("[I]nsert");
            System.out.println("[D]elete");
            System.out.println("[S]earch");
            System.out.println("[V]iew books");
            System.out.println("[U]pdate");
            System.out.println("e[X]it");
            System.out.println("Enter Your Choice : ");
            ch= sc.nextLine().toLowerCase();

            switch (ch) {
                case "i":

                    System.out.println("Enter Book Name : ");
                    String bookName = sc.nextLine();
                    System.out.println("Enter Book Author : ");
                    String autName = sc2.nextLine();
                    library.addBook(bookName,autName);

                    break;

                case "v":
                    library.showBooks();
                    break;

                case "s":
                    System.out.println("Enter Book Id to Search : ");
                    int bookIdSearch = sc.nextInt();
                    boolean found= library.searchBook(bookIdSearch);
                    System.out.println("+------------------------------------------------------------+");

                        if (!found) {
                            System.out.println("Record Not Found .");
                        }
                        System.out.println("+------------------------------------------------------------+");
                        break;



                case "d" :
                    System.out.println("Enter Book Id to Delete : ");
                    int  bookIdSearch2 = sc.nextInt();
                    boolean found2= library.deleteBook(bookIdSearch2);
                    System.out.println("+------------------------------------------------------------+");

                    if (!found2) {
                        System.out.println("Record Not Found .");
                    }else {
                        System.out.println("Record Deleted Succeessfully.");
                    }

                    System.out.println("+------------------------------------------------------------+");
                    break;

                case "u" :

                    System.out.println("Enter Book Id to Update : ");
                    bookIdSearch = sc.nextInt();
                    System.out.println("+------------------------------------------------------------+");

                   boolean found3 = library.deleteBook(bookIdSearch);
                    if(found3){
                        System.out.println("Record is Updated" +
                                " Successfully ..!");


                    } else{
                        System.out.println("Record Not Found .");
                    }
                    System.out.println("+------------------------------------------------------------+");
                    break;
            }
        }

        while (!ch.equals("x"));
    }

}