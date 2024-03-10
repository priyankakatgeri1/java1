package library.management.system_1;
import java.util.ArrayList;
import java.util.List;

public class ReturnBook {
    private int id;
    private String title;
    private boolean issued;

    public ReturnBook(int id, String title) {
        this.id = id;
        this.title = title;
        this.issued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }
}

class library {
    private List<Books> books;

    public library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Books book) {
        books.add(book);
    }

    public void issueBook(int bookId) {
        for (Books book : books) {
            if (book.getId() == bookId && !book.isIssued()) {
                book.setIssued(true);
                System.out.println("Book " + book.getTitle() + " issued successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not available.");
    }

    public void returnBook(int bookId) {
        for (Books book : books) {
            if (book.getId() == bookId && book.isIssued()) {
                book.setIssued(false);
                System.out.println("Book " + book.getTitle() + " returned successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " was not issued or does not exist.");
    }
}

