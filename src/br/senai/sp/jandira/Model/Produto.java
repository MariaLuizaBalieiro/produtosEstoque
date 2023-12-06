package br.senai.sp.jandira.Model;

public class Produto  {
    String codigo;
    String nome;
    int quantidade;
    double preco;
    String fornecedor;

    public Produto(String codigo, String nome, int quantidade, double preco, String fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }
}

