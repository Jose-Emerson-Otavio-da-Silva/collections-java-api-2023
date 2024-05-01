package main.java.list.OperacoesBasicas;

public class Tarefa {
    @Override
    public String toString() {
        return descricao;
    }

    // atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
