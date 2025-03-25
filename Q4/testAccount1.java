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
public class testAccount1 {
    public static void main(String[] args) {
        Account1 acc=new Account1("George",1122,1000);
        acc.setAnnualInterestRate(1.5);
        
        acc.deposit(30);
        acc.deposit(40);
        acc.deposit(50);
        
        acc.withdraw(5);
        acc.withdraw(4);
        acc.withdraw(2);
        
        acc.accountSummary();
    }
}
