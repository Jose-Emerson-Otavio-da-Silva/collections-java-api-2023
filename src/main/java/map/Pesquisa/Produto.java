package main.java.map.Pesquisa;

import java.security.PublicKey;

public class Produto {

    // atributos
    private String nome;
    private double preco;
    private int quantidade;

    /**
     * metodo construtor
     * 
     * @param nome
     * @param preco
     * @param quantidade
     */
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
}
