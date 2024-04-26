package org.example.Inheritance;

public class Account {

    //Attributes
    private String owner;
    private double balance;

    public void withdraw(double takeMoney) throws Exception{
        try {
            if (takeMoney <= balance) {
                balance -= takeMoney;
                System.out.println("the balance update is now = " + balance);
            }
            else {
                System.out.println("Impossible withdraw money when is higher than balance");
            }
        }
        catch(Exception e){
            e.getMessage();
            }
    }

    public void deposit(double value){
        if(value > 0){
            balance += value; //valor depositado
            System.out.println("Update balance: " + balance);
        }
        else {
            System.out.println(" the value must be higher than zero");
        }
    }

    //Getter and Setters

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
