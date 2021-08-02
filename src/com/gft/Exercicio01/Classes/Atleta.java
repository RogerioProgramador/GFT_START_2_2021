package com.gft.Exercicio01.Classes;

public class Atleta {
    private String nome;
    private String país;
    private Integer metros;


    //Métodos especiais
    public String dados() {
        return this.nome + " - " + this.país + " Resultado: " + this.metros + "m";
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public Integer getMetros() {
        return metros;
    }

    public void setMetros(Integer metros) {
        if (metros < 0) {
            this.metros = 0;
        } else {
            this.metros = metros;
        }
    }
}
