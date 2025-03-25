/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds.lab01;

/**
 *
 * @author deena
 */
import java.util.*;
public class testAcoount {
    public static void main(String[] args) {
        Account cust1=new Account(1122,20000);
        cust1.setAnnualInterestRate(4.5);
        cust1.withdraw(2500);
        cust1.deposit(3000);
        
        System.out.println("Account Balance : $"+cust1.getBalance());
        System.out.println("Monthly Interest : $"+cust1.getMonthlyInterest());
        System.out.println("Date account created : "+cust1.getDateCreated());
    }
}
