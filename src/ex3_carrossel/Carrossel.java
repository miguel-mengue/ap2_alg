package ex3_carrossel;

public class Carrossel {

    private NoAnuncio anuncioAtual;

    public Carrossel() {
        anuncioAtual = null;
    }

    public void adicionar(Anuncio anuncio) {

        NoAnuncio novo = new NoAnuncio(anuncio);

        if (anuncioAtual == null) {
            anuncioAtual = novo;
            novo.proximo = novo;
            return;
        }

        NoAnuncio aux = anuncioAtual;

        while (aux.proximo != anuncioAtual) {
            aux = aux.proximo;
        }

        aux.proximo = novo;
        novo.proximo = anuncioAtual;
    }

    public void exibirAvancar() {

        if (anuncioAtual == null) {
            System.out.println("Nenhum anúncio cadastrado.");
            return;
        }

        anuncioAtual.anuncio.exibicoes++;

        System.out.println("\nAnúncio em exibição:");
        System.out.println(anuncioAtual.anuncio);

        anuncioAtual = anuncioAtual.proximo;
    }

    public void listarCiclo() {

        if (anuncioAtual == null) {
            System.out.println("Lista vazia.");
            return;
        }

        NoAnuncio inicio = anuncioAtual;
        NoAnuncio aux = anuncioAtual;

        do {
            System.out.println(aux.anuncio);
            aux = aux.proximo;
        } while (aux != inicio);
    }

    public void remover(int id) {

        if (anuncioAtual == null) {
            System.out.println("Lista vazia.");
            return;
        }

        NoAnuncio atual = anuncioAtual;
        NoAnuncio anterior = null;

        do {

            if (atual.anuncio.id == id) {

                if (atual == anuncioAtual && atual.proximo == anuncioAtual) {
                    anuncioAtual = null;
                    System.out.println("Anúncio removido.");
                    return;
                }

                if (atual == anuncioAtual) {

                    NoAnuncio ultimo = anuncioAtual;

                    while (ultimo.proximo != anuncioAtual) {
                        ultimo = ultimo.proximo;
                    }

                    anuncioAtual = anuncioAtual.proximo;
                    ultimo.proximo = anuncioAtual;

                    System.out.println("Anúncio removido.");
                    return;
                }

                anterior.proximo = atual.proximo;

                System.out.println("Anúncio removido.");
                return;
            }

            anterior = atual;
            atual = atual.proximo;

        } while (atual != anuncioAtual);

        System.out.println("Anúncio não encontrado.");
    }

    public void exibirAutomatico(int vezes) {

        if (anuncioAtual == null) {
            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < vezes; i++) {

            exibirAvancar();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Erro.");
            }
        }
    }
}