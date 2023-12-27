package LibraryManagementApp;


import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    //add the book
    public void addBook() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the book you're looking for: ");
        String bookName = input.nextLine();
        System.out.println();
        System.out.print("Kindly enter the name of the author: ");
        String author = input.nextLine();
        System.out.println();
        books.add(new Book(bookName, author));
        System.out.println("Book added successfully. Thank you for your input!");
    }

    //check out the book
    public void checkOutBook() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the book you're looking for: ");
        String bookName = input.nextLine();
        System.out.println();
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName) && book.getAvailability()) {
                book.setAvailability(false);
                System.out.println("Book checked out successfully. Enjoy your reading!");
                return;
            }
            if (book.getBookName().equalsIgnoreCase(bookName) && !book.getAvailability()) {
                System.out.println("Sorry, the requested book is currently not available. If you have any other titles in mind or need assistance, \nplease feel free to ask.");
                return;
            }
        }
        System.out.println("We regret to inform you that the requested book is not present in the library at the moment. \nIf you have any other titles in mind or if there's anything else we can assist you with, \nplease don't hesitate to let us know. Thank you for your understanding.");
    }

    //return the book
    public void returnBook() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the book you're looking for: ");
        String bookName = input.nextLine();
        System.out.println();
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName) && !book.getAvailability()) {
                book.setAvailability(true);
                System.out.println("Book return is successful. Thank you for returning the book on time.");
                return;
            }
            if (book.getBookName().equalsIgnoreCase(bookName) && book.getAvailability()) {
                book.setAvailability(true);
                System.out.println("it appears that this book has already been returned. ");
                return;
            }
        }
        System.out.println("The book you're trying to return does not belong to our library collection.");
    }

    //display all the books
    public void displayAllBook() {
        System.out.println("-------Books in the Library-------");
        int srno = 0;
        for (Book book : books) {
            System.out.println(++srno + ". " + book.getBookName());
        }
    }

    //display all details on the book
    public void displayDetailsOfBook() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the book you're looking for: ");
        System.out.println();
        String bookName = input.nextLine();
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("We regret to inform you that the requested book is not present in the library at the moment. \nIf you have any other titles in mind or if there's anything else we can assist you with, \nplease don't hesitate to let us know. Thank you for your understanding.");
    }
    public void mainLoop() {
        System.out.println();
        System.out.println("--------------Welcome! to AK Library App------------");
        printMenu();

        int userChoice = -1;

        while (!(userChoice == 6)) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your choice-> ");
            userChoice = input.nextInt();

            switch (userChoice) {
                case 1 -> {
                    addBook();
                    printMenu();
                }
                case 2 -> {
                    checkOutBook();
                    printMenu();
                }
                case 3 -> {
                    returnBook();
                    printMenu();
                }
                case 4 -> {
                    displayAllBook();
                    printMenu();
                }
                case 5 -> {
                    displayDetailsOfBook();
                    printMenu();
                }
                case 6 -> {
                    printQuitMessage();
                }
                default -> {
                    System.out.println();
                    System.out.println("Kindly select one of the available commands...!");
                    printMenu();
                }
            }
        }
    }
    public static void printMenu() {
        System.out.println();
        System.out.println("1. Adding the book");
        System.out.println("2. Checkout the bool");
        System.out.println("3. Return the book");
        System.out.println("4. See the books");
        System.out.println("5. Show details on the book");
        System.out.println("6. Exist");
        System.out.println();
    }
    public static void printQuitMessage() {
        System.out.println("We hope you're enjoying your time exploring our library management app!");
        System.out.println("Happy reading!");
    }

    public void defaultBooks() {
        books.add(new Book("The Java Programming Language", "James Gosling"));
        books.add(new Book("The C++ Programming Language", "Bjarne Stroustrup"));
        books.add(new Book("The Art of Computer Programming", "Donald Knuth"));
        books.add(new Book("Close to the Machine", "Eilen Ullman"));
        books.add(new Book("Fundamentals of Computer Algorithms", "Ellis Horowitz"));
        books.add(new Book("The Art of Unix Programming", "Eric Raymond"));
        books.add(new Book("The Best Software Writing I", "Joel Spolsky"));
        books.add(new Book(" After the Software Wars", "Keith Curtis"));
        books.add(new Book("Free Software, Free Society", "Richard M. Stallman"));
        books.add(new Book("Patterns of Software", "Richard P. Gabriel"));
        books.add(new Book("Innovation Happens Elsewhere", "Richard P. Gabriel"));
        books.add(new Book("Hackers: Heroes of the Computer Revolution", "Steven Levy"));
        books.add(new Book("The New Hacker's Dictionary", "Eric S. Raymond "));
    }
}

