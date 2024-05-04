package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    // atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    /**
     * metodo para adicionar novo contato
     * 
     * @param nome
     * @param numero
     */
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    /**
     * Metodo para exibir todos os contatos do set
     */
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    /**
     * Metodo que vai pesquisar contatos por nome dentro do set
     * 
     * @param nome
     * @return
     */
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatoPorNome.add(contato);
            }
        }
        return contatoPorNome;
    }

    /**
     * Metodo para atualizar o numero de contato
     * 
     * @param nome
     * @param novoNumero
     * @return
     */
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 9999));
    }
}
