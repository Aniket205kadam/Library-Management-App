package LibraryManagementApp;


import java.util.Scanner;

public class Main {
    public static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        Library library = new Library();
        library.defaultBooks();
        library.mainLoop();
        keyboard.close();
    }
}

/*Task*/
/*
 * Build a Java Application to handle library operations. Include functions like
 * adding books, checking out books, returning books, and displaying available
 * books.
 * */

