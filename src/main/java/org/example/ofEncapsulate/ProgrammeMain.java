package org.example.ofEncapsulate;

public class ProgrammeMain {
    public static void main(String[] args) {

        Account ac = new Account();


        ac.deposit(2000);
        System.out.println(ac.getBalance());
    }
}
