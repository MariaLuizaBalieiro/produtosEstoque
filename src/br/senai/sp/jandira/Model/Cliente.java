package br.senai.sp.jandira.Model;

public class Cliente {
    String cpf;
    String nome;
    String endereco;
    String email;

    public Cliente(String cpf, String nome, String endereco, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
}
