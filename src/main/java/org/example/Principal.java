package org.example;

import org.example.alura.screenmatch.models.Movie;
import org.example.alura.screenmatch.models.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }



        Movie myMovie = new Movie();
        myMovie.setName("The Godfather");
        myMovie.setYearOfRelease(1984);
        myMovie.setDurationInMinutes(180);

        myMovie.displaysTechnicalFile();
        myMovie.evaluate(8);
        myMovie.evaluate(10);
        myMovie.evaluate(5);
        System.out.println("Total of avaliations: " + myMovie.getTotalOfAvaliations());

        System.out.println(String.format("Medium of total of avaliations is %.2f :" , myMovie.returnMediaOfAvaliations()));


        System.out.println("------------------------------------------------");

        Serie lost = new Serie();
        lost.setEpisodesBySeason(12);
        //lost.setMinutesByEpisode(180);
        lost.setYearOfRelease(2008);
        lost.setName("coco");
        lost.displaysTechnicalFile();
        lost.evaluate(10);
        lost.evaluate(12);
        double variavelToSaveValue = lost.getTotalOfAvaliations();

        System.out.println("NUmber of Episodes by Season" + lost.getEpisodesBySeason());
        System.out.println("Minutes by Episode: " + lost.getMinutesByEpisode());
        System.out.println("Year of release" + lost.getYearOfRelease() );
        lost.displaysTechnicalFile();
        System.out.println("avaliations of serie lost: " + variavelToSaveValue );
        System.out.println("Media of avaliations of serie lost: " + lost.returnMediaOfAvaliations());
        lost.setSeasons(10);
        lost.setEpisodesBySeason(10);
        lost.setMinutesByEpisode(50);
        System.out.println("Duration of watching all seasons or episodes of Lost " + lost.getDurationInMinutes());
    }
}