package org.example.ofEncapsulate;

public class Account {

    private int number;
    private int agency;
    private double balance;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }
        else {
            System.out.println("Balance insuficient");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public double getBalance() {
        return balance;
    }

    /*
    public void setBalance(double balance) {
        this.balance = balance;
    }

     */
}
