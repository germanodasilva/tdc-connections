package com.thedevconf.kogito.model;

public class Pessoa {

    private String nome;
    private String cpf;
    private String rg;
    private int idade;
    private boolean maiorIdade;

    public String getNome() {
        return this.nome;
    }

    public boolean isMaiorIdade() {
        return maiorIdade;
    }

    public void setMaiorIdade(boolean maiorIdade) {
        this.maiorIdade = maiorIdade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {

        return "Pessoa [name" + nome + "Idade=" + idade + "cpf=" + cpf + "rg=" + rg + "]";
    }
    
}
