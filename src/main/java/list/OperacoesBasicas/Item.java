package main.java.list.OperacoesBasicas;

public class Item {

    // Atributos
    String nome;
    double preco;
    int quantidade;

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Construtor
     * 
     * @param nome
     * @param preco
     * @param quantidade
     */
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\n" + quantidade + " x " + nome + " - R$" + preco + " cada";
    }
}
