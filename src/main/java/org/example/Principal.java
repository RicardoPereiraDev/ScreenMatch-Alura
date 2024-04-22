package org.example;

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
        myMovie.name = "The Godfather";
        myMovie.yearOfRelease = 1984;
        myMovie.durationInMinutes = 180;

        myMovie.displaysTechnicalFile();
        myMovie.evaluate(8);
        myMovie.evaluate(10);
        myMovie.evaluate(5);
        System.out.println(myMovie.sumOfAvaliation);
        System.out.println(myMovie.totalOfAvaliations);

        System.out.println(String.format("Medium of total of avaliations is %.2f :" , myMovie.returnMediaOfAvaliations()));
    }
}