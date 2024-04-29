package org.example.II_heranca;

public class TestaManager {
    public static void main(String[] args) {

        Manager manager = new Manager();

        System.out.println("------------------------------------------------------");
        //Podemos chamar metodos do treinador:
        System.out.print("Nome do Treinador a ser contratado: ");
       // System.out.println();
        manager.setNome("Guardiola");
        System.out.println(" *** " + manager.getNome() + " *** ");
        System.out.println();
        manager.classificarTreinador(10,11);

        System.out.println(" Senha: " + manager.getSenha());
        manager.autenticar(123456);
        System.out.println("*-----------------------------------------------------------------------------*");

        //--------------------------Classe Treinador----------------------------------------------

        Treinador treinador = new Treinador();

        treinador.setSalario(2000);
        treinador.setTitulos(1);
        //treinador.getBonificacao();

        manager.setSalario(3000);
        manager.setTitulos(3);
        //manager.getBonificacao();

        System.out.println("Treinador e sua equipa técnica: " + treinador.getBonificacao());
        System.out.println("*---------*---------*-----------*");
        System.out.println("Manager: " + manager.getBonificacao());

    }
}
