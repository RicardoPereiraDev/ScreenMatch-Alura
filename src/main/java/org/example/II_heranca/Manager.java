package org.example.II_heranca;

//Atributos
public class Manager extends Treinador {

    String nome;
    int idCidadao;
    double salario;

/*
Nota:
Senha numérica geral: que permite o acesso ao sistema interno sobre a informação desportiva dos atletas na base de dados(consulta sobre a ficha do proprio jogador
  e consulta apenas de dados estatisticos dos colegas.
  Outras informações detalhadas sobre os feedbacks individuais do treinador só acessivel através de outra password individual para cada atleta.

Nota:
Senha numérica para equipa tecnica:
  Informações sobre sistemas e esquemas taticos apenas acessivel à equipa tecnica com permissões de acesso tambem para o manager e Presidente
  */

    int senhaGeral;

    int senha = 123456;

    int numeroDeTreinadoresGeridos;


    //metodos:
    public boolean autenticar(int senha){
        if(senha == this.senha){
            System.out.println(" Acesso permitido");
            return true;
        }
        else{
            System.out.println(" Acesso negado");
            return false;
        }
    }

    @Override
    public String getBonificacao(){
        double valorBonificacao = 0.20;
        double bonificacao = this.salario + (this.salario * valorBonificacao);
        return super.getBonificacao() + bonificacao;
        /*
        if(titulos >= 2){
            double bonificacao = this.salario + (this.salario * valorBonificacao);

            return String.format("Bonificação atribuida pela a(s) conquista(s) de titulo(s)! Bonificação =  %.2f" , bonificacao);
        }
        else{
            return "Zero Bonificações - Zero titulos conquistados";
        }

         */
    }

    //Metodos Getter and Setter
    //Setter da senha omitido


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdCidadao() {
        return idCidadao;
    }

    public void setIdCidadao(int idCidadao) {
        this.idCidadao = idCidadao;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getSenhaGeral() {
        return senhaGeral;
    }

    /*
    public void setSenhaGeral(int senhaGeral) {
        this.senhaGeral = senhaGeral;
    }
    */
    public int getSenha() {
        return senha;
    }

    /*
    public void setSenha(int senha) {
        this.senha = senha;
    }
    */

    public int getNumeroDeTreinadoresGeridos() {
        return numeroDeTreinadoresGeridos;
    }

    public void setNumeroDeTreinadoresGeridos(int numeroDeTreinadoresGeridos) {
        this.numeroDeTreinadoresGeridos = numeroDeTreinadoresGeridos;
    }
}

