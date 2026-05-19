package ex3_carrossel;

public class Anuncio {
    int id;
    String empresa;
    String descricao;
    int exibicoes;

    public Anuncio(int id, String empresa, String descricao) {
        this.id = id;
        this.empresa = empresa;
        this.descricao = descricao;
        this.exibicoes = 0;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Empresa: " + empresa +
                " | Descrição: " + descricao +
                " | Exibições: " + exibicoes;
    }
}
