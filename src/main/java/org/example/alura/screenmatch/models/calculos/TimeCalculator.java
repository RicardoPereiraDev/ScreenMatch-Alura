package org.example.alura.screenmatch.models.calculos;

import org.example.alura.screenmatch.models.Movie;
import org.example.alura.screenmatch.models.Serie;
import org.example.alura.screenmatch.models.Title;

public class TimeCalculator {

    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    /*
    public void include(Movie m){
        totalTime += m.getDurationInMinutes();

    }

    public void include(Serie s){
        this.totalTime += s.getDurationInMinutes();
    }
    */

    //Polimorfismo - Neste metodo infra estamos uilizando o Polimorfismo, ou seja, eu neste caso naão sei se ele vai ultizar Series ou Movies.
    public void include(Title title){
        System.out.println("Add duration in minutes of " + title);
        this.totalTime += title.getDurationInMinutes();

    }

}
