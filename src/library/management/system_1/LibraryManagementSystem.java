package library.management.system_1;


import java.util.ArrayList;
import java.util.List;



// Book class to represent a book
class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

// LibraryMember class to represent a library member
class LibraryMember {
    private String name;
    private List<Book> borrowedBooks;

    public LibraryMember(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setAvailable(false);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setAvailable(true);
    }
}

// Library class to represent a library
class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                return book;
            }
        }
        return null;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("Java Programming", "John Doe"));
        library.addBook(new Book("Python Programming", "Jane Smith"));
        library.addBook(new Book("C++ Programming", "Alice Johnson"));

        // Display available books
        library.displayAvailableBooks();

        // Create a library member
        LibraryMember member1 = new LibraryMember("Alice");

        // Alice borrows a book
        Book book = library.findBookByTitle("Java Programming");
        if (book != null) {
            member1.borrowBook(book);
            System.out.println("Book borrowed: " + book.getTitle());
        } else {
            System.out.println("Book not available");
        }

        // Display available books after borrowing
        library.displayAvailableBooks();

        // Alice returns the book
        member1.returnBook(book);
        System.out.println("Book returned: " + book.getTitle());

        // Display available books after returning
        library.displayAvailableBooks();
    }
}
