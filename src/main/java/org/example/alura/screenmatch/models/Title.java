package org.example.alura.screenmatch.models;

public class Title {

    private String name;
    private int yearOfRelease;
    private boolean includeInPlan;
    private double sumOfAvaliation;
    private int totalOfAvaliations;
    private int durationInMinutes;



    public void displaysTechnicalFile(){
        System.out.println("Name of movie: " + name);
        System.out.println("The Year of release: " + yearOfRelease);

    }
    public void evaluate(double note){
        sumOfAvaliation += note;
        totalOfAvaliations++;

    }

    public double returnMediaOfAvaliations(){

        double media = sumOfAvaliation/totalOfAvaliations;
        return media;
    }

    public  int getTotalOfAvaliations(){

        return totalOfAvaliations;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setIncludeInPlan(boolean includeInPlan) {
        this.includeInPlan = includeInPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean isIncludeInPlan() {
        return includeInPlan;
    }

    public double getSumOfAvaliation() {
        return sumOfAvaliation;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
