package be.bruxellesformation.bib_git;

public class Main {
    public static void main(String[] args) {
        System.out.println("+------------------------------+");
        System.out.println("Welcome to our Book Application.");
        System.out.println("+------------------------------+");

        Book book1 = new Book(1,"Harry Potter and the Cursed Child","J.K. Rowling");
        Book book2 = new Book(2,"The Christie Affair","Nina de Gramont");
    }

}