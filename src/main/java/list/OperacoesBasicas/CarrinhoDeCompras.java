package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // atributo
    List<Item> listaItens;

    /**
     * Construtor
     */
    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList();
    }

    /**
     * Metodo para adicionar item ao carrinho
     * 
     * @param nome
     * @param preco
     * @param quantidade
     */
    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    /**
     * Metodo para remover item da lista de itens do carrinho
     * 
     * @param nome
     */
    public void removerItem(String nome) {
        List<Item> itensRemover = new ArrayList();
        if (listaItens.isEmpty()) {
            System.out.println("A lista de compras está vazia");
        } else {
            for (Item item : listaItens) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensRemover.add(item);
                }
            }
        }
        listaItens.removeAll(itensRemover);
    }

    /**
     * Metodo que retorna o valor total da lista de itens do carrinho
     * 
     * @return valorTotal
     */
    public double calculaValorTotal() {
        double valorTotal = 0;
        if (listaItens.isEmpty()) {
            throw new RuntimeException("A lista de compras está vazia");
        } else {
            for (Item item : listaItens) {
                valorTotal += item.preco * item.quantidade;
            }
        }
        return valorTotal;
    }

    /**
     * Metodo que exibe lista de itens do carrinho de compras
     */
    public void exibirItens() {
        if (listaItens.isEmpty()) {
            System.out.println("A lista de compras está vazia");
        } else {
            System.out.println(listaItens);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("teste");

        // carrinhoDeCompras.adicionarItem("camiseta", 50, 2);
        // carrinhoDeCompras.adicionarItem("calça", 80, 1);
        // carrinhoDeCompras.adicionarItem("calça", 100, 1);

        // carrinhoDeCompras.removerItem("calça");

        // carrinhoDeCompras.adicionarItem("calça", 80, 1);
        // carrinhoDeCompras.adicionarItem("calça", 100, 1);

        // carrinhoDeCompras.exibirItens();

        System.out.println("Valor total do carrinho de compras = " +
                carrinhoDeCompras.calculaValorTotal());
    }

}
