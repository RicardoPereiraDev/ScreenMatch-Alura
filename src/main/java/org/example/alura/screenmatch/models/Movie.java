package org.example;

public class Movie {

    String name;
    int yearOfRelease;
    boolean includeInPlan;
    private double sumOfAvaliation;
    private int totalOfAvaliations;
    int durationInMinutes;



    void displaysTechnicalFile(){
        System.out.println("Name of movie: " + name);
        System.out.println("The Year of release: " + yearOfRelease);

    }
    void evaluate(double note){
        sumOfAvaliation += note;
        totalOfAvaliations++;

    }

    int getTotalOfAvaliations(){
        return totalOfAvaliations;
    }

    double returnMediaOfAvaliations(){

        double media = sumOfAvaliation/totalOfAvaliations;
        return media;
    }
}
