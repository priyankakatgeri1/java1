/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system_1;
import java.util.Scanner;

public class BookIssue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days the book can be issued:");
        int days = scanner.nextInt();
        System.out.print("Enter the number of days to repeat:");
        int repeatDays = scanner.nextInt();
        int synchronous = days%repeatDays;
        int alternative=repeatDays-synchronous;
        System.out.println("Synchronous days:"+synchronous);
        System.out.println("Alternative days:"+alternative);
        scanner.close();
    }
    
}
