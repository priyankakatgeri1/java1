package library.management.system_1;
import java.util.Scanner;
public class UserInfo{
    private String name;
    private int id;
    private String username;
    private String password;
    
    //constructor to initialise the object with default values
    public UserInfo() {
        name="";
        id=0;
        username="";
        password="";
    }
    
    //method to enter user information
    public void enterUserInfo() {
        Scanner scanner=new Scanner(System.in);
        
       //Prompt user to enter name
       System.out.println("enter your name:");
       this.name=scanner.nextLine();
       
       //prompt user to enter id
       System.out.println("enter your id:");
       this.id=scanner.nextInt();
       scanner.nextLine(); //consume newLine
       
       //Prompt user to enter username
       System.out.println("enter your username:");
       this.username=scanner.nextLine();
       
       //Prompt user to enter password
       System.out.println("enter your password:");
       this.password=scanner.nextLine();
       
    //method to display user information
public class void displayUserInfo() {
        System.out.println("\n Name:"+name);
        System.out.println("id:"+id);
        System.out.println("Username:"+username);
        System.out.println("password:"+password);
    }
        
    }
public 
public static void main(String[] args) {
        LibraryUser user=new LibraryUser(); //object creation
        System.out.println("Welcome to Library Management System!");
        user.enterUserInfo(); //calling method to enter user information
        System.out.println("\nUser information entered succesfully");
        user.displayUserInfo(); //calling method to display user information
    }
    
}
