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
public class Account {
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date dateCreated;

    public Account() {
        this.dateCreated = dateCreated;
    }

    public Account(int id, double initialBalance){
        this.id=id;
        this.balance=initialBalance;
        this.dateCreated=new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/100/12;
    }
    
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }else{
            System.out.println("Insufficient balance for withdrawal");
        }
    }
    
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }else{
            System.out.println("Deposit amount must be positive");
        }
    }
}
