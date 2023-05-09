package model;

public class Aluno {
    private final String nome;
    private final int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String toString() {
        return this.nome + " | " + this.matricula;
    }
}
