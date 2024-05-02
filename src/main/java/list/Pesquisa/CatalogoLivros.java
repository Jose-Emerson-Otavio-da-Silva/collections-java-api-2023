package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributo
    private List<Livro> livroList;

    /**
     * Construtor
     */
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    /**
     * Metodo que adiciona livros na lista
     * 
     * @param titulo
     * @param autor
     * @param anoPublicacao
     */
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    /**
     * Metodo para pesquisar lista de livros pelo autor
     * 
     * @param autor
     * @return
     */
    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }

        return livrosPorAutor;
    }

    /**
     * Metodo que retorna lista de livro por intervalo de ano de lancamento
     * 
     * @param anoInicial
     * @param anoFinal
     * @return
     */
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervaloAno = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAno.add(livro);
                }
            }
        }

        return livrosPorIntervaloAno;
    }

    /**
     * Metodo de pesquisar livro pelo titulo
     * 
     * @param titulo
     * @return
     */
    public Livro pesquisarPorTitulo(String titulo) {

        Livro livroPorTitulo = null;

        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                }
                break;
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }

}
