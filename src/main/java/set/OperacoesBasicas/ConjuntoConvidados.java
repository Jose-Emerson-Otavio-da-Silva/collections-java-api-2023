package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    // atributo
    private Set<Convidado> convidadoSet;

    /**
     * Metodo construtor
     */
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    /**
     * Metodo para adicionar convidade
     * 
     * @param nome
     * @param codigoConvite
     */
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    /**
     * Metodo para remover convidado pelo numero do convite
     * 
     * @param codigoConvite
     */
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    /**
     * Metodo para contar convidados
     * 
     * @return quantidade de convidados no Set
     */
    public int contarConvidados() {
        return convidadoSet.size();
    }

    /**
     * Metodo para exibir todos os convidados no set
     */
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existte " + conjuntoConvidados.contarConvidados() +
                " convidado(s) dentro do Set de convidados.");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1238);

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Existte " + conjuntoConvidados.contarConvidados() +
                " convidado(s) dentro do Set de convidados.");

        conjuntoConvidados.exibirConvidados();
    }
}
