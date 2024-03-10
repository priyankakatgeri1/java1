package library.management.system_1;
import java.util.ArrayList;
import java.util.List;


class Author {
    private String name;
    private List<Books>books;
    public Author(String name){
        this.name=name;
        this.books=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addBook(Books book){
        books.add(book);
    }
    public List<Books> getBooks(){
        return books;
    }
}
class book{
    private String title;
    private boolean available;
    public book(String title){
        this.title=title;
        this.available=true;        
    }
    public String getTitle(){
        return title;
    }
    public boolean isAvailable(){
        return available;
    }
    public void setAvailable(boolean available){
        this.available=available;      
    }
}
class Lib {
    private List<Books>books;
    public Lib (){
        this.books=new ArrayList<>();
    }
    public void addBooks(Books book){
        books.add(book);       
    }
    public boolean isBookAvailable(String title){
        for(Books book : books){
            if(book.getTitle().equals(title)&&book.isAvailable()){
             return true;
            }
        }
        return false;
    }
    public Books borrowBook(String title){
        for(Books book : books){
            if(book.getTitle().equals(title)&&book.isAvailable()){
                book.setAvailable(false);
                return book;
            }
        }
        return null;
    }
}
class Library {
    public static void main(String[] args) {
        Library library = new Library();

        Books book1 = new Books(1, "Java Programming");
        Books book2 = new Books(2, "Data Programming");

        library.addBooks(book1);
        library.addBooks(book2);

        library.issueBooks(1);
        library.returnBooks(1);
    }
}
    




public class Main {
    public static void main(String[] args){
        Author author=new Author("John Doe");
        Books book1=new Books("Java Programming");
        Books book2=new Books("Data Structures");
        author.addBook(book1);
        author.addBook(book2);
        Library library=new Library();
        library.addBook(book1);
        library.addBook(book2);
        String title="Java Programming";
        if(library.isBookAvailable(title)){
            System.out.println("Book is available. Booking...");
            Book borrowedBook=library.borrowBook(title);
            System.out.println("Book"+borrowedBook.getTitle()+"by"+author.getName()+"has been booked.");
        }else{
            System.out.println("Book is not available.");
        }
        
    }
    
}

    

