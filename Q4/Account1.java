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
public class Account1 extends Account{
    private String name;
    private double balance;
    private int id;
    private double annualInterestRate;
    private ArrayList<Transaction> transactions;
    
    public Account1(String name, int id, double balance) {
        this.id=id;
        this.name = name;
        this.balance=balance;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public void deposit(double amount) {
        if(amount>0){
            balance+=amount;
            transactions.add(new Transaction('D',amount,balance,"Deposit of $"+amount));
        }else{
            System.out.println("Deposit amount must be positive");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=balance){
            balance-=amount;
            transactions.add(new Transaction('W',amount,balance,"Withdrawal of $"+amount));
        }else{
            System.out.println("Insufficient balance for withdrawal");
        }
    }

    public void accountSummary(){
        System.out.println("Account holder name : "+name);
        System.out.println("Annual interest rate : "+getAnnualInterestRate()+"%");
        System.out.println("Account balance : $"+balance);
        for(Transaction trans:transactions){
            System.out.println(trans);
        }
    }
}
