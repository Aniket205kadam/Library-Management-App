package LibraryManagementApp;

public class Book {
    private String bookName;
    private String author;
    private boolean availability;

    public Book(String title, String author) {
        this.bookName = title;
        this.author = author;
        this.availability = true;
    }

    public String getBookName() {
        return this.bookName;
    }
    public boolean getAvailability() {
        return this.availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Book name -> " + bookName + " : Author -> " + author + " : availability -> " + availability;
    }
}

