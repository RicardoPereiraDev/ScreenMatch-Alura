package org.example;

import java.sql.SQLOutput;

public class Movie {

    String name;
    int yearOfRelease;
    boolean includeInPlan;
    double avaliation;
    int totalOfAvaliations;
    int durationInMinutes;

    void displaysTechnicalFile(){
        System.out.println("Name of movie: " + name);
        System.out.println("The Year of release: " + yearOfRelease);
    }
}
