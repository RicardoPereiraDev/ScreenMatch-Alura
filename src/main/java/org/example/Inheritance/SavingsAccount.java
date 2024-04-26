package org.example.Inheritance;

public class SavingsAccount extends Account{

    private double interestRates;

    public void CalculateInterests(){
        double interest = this.getBalance() * interestRates;
        System.out.println("Update interest: " + interest);
    }

    @Override
    public void withdraw(double value) throws Exception{
        double taxOfWithdraw = 0.01;
        try{

            super.withdraw(value + taxOfWithdraw);
            System.out.println("Sucess with witdraw");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
