package org.example.II_heranca;

public class Treinador {

    //atributos
    protected int idCidadao;
    protected String name;

    protected double salario;

    protected int expProfissional;

    protected int titulos;


    /*
    regras de negocio:

    -niveis de classificação para treinador : amador, semi-profissional, profissional bom, profissional mediano, professional mau, competente, altamente competente, especial e legendario


     - Se treinar mais que 15 anos e ganhar 15 titulos - treinador altamente competente;

     - Se treinar mais que 15 anos e ganhar 5 titulos - treinador competente;
     */

    //metodos
    public void classificarTreinador(int titulos, int expProfissional){
        if(titulos >= 5 && titulos < 10 && expProfissional >= 5 && expProfissional <= 10){
            System.out.println("Treinador competente");
        }
        else if(titulos >= 10 && titulos < 15 && expProfissional > 10 && expProfissional < 15){
            System.out.println("Treinador altamente competente");
        }
        else if (titulos >= 15 && expProfissional >= 15) {
            System.out.println("Treinador special");
            
        }
        else{
            System.out.println("Treinador do ALILAL, não elegivel para ser contratado KKKKKKK");
        }
    }

    //Outros metodos...

    public String getBonificacao(){
        double valorBonificacao = 0.15;
        if(titulos >= 1){
           double bonificacao = this.salario + (this.salario * valorBonificacao);

            return String.format("Bonificação atribuida pela a(s) conquista(s) de titulo(s)! Bonificação = " , bonificacao);
        }
        else{
            return "Zero Bonificações - Zero titulos conquistados";
        }
    }

    public int getId() {
        return idCidadao;
    }

    public void setId(int id) {
        this.idCidadao = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getExpProfissional() {
        return expProfissional;
    }

    public void setExpProfissional(int expProfissional) {
        this.expProfissional = expProfissional;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }
}
