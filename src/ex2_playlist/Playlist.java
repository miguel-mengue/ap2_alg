package ex2_playlist;

public class Playlist {

    private NoMusica inicio;
    private NoMusica fim;
    private NoMusica atual;

    public Playlist() {
        inicio = null;
        fim = null;
        atual = null;
    }

    public void adicionarFim(Musica musica) {
        NoMusica novo = new NoMusica(musica);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
            atual = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void adicionarInicio(Musica musica) {
        NoMusica novo = new NoMusica(musica);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
            atual = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
    }

    public void adicionarPosicao(Musica musica, int posicao) {

        if (posicao <= 1 || inicio == null) {
            adicionarInicio(musica);
            return;
        }

        NoMusica novo = new NoMusica(musica);
        NoMusica aux = inicio;
        int contador = 1;

        while (aux.proximo != null && contador < posicao - 1) {
            aux = aux.proximo;
            contador++;
        }

        if (aux.proximo == null) {
            adicionarFim(musica);
            return;
        }

        novo.proximo = aux.proximo;
        novo.anterior = aux;

        aux.proximo.anterior = novo;
        aux.proximo = novo;
    }

    public void proxima() {
        if (atual == null) {
            System.out.println("Playlist vazia.");
            return;
        }

        if (atual.proximo != null) {
            atual = atual.proximo;
        } else {
            System.out.println("Última música.");
        }
    }

    public void anterior() {
        if (atual == null) {
            System.out.println("Playlist vazia.");
            return;
        }

        if (atual.anterior != null) {
            atual = atual.anterior;
        } else {
            System.out.println("Primeira música.");
        }
    }

    public void tocar() {
        if (atual == null) {
            System.out.println("Playlist vazia.");
            return;
        }

        System.out.println("\nTocando:");
        System.out.println(atual.musica);
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Playlist vazia.");
            return;
        }

        NoMusica aux = inicio;

        while (aux != null) {
            System.out.println(aux.musica);
            aux = aux.proximo;
        }
    }

    public void removerTitulo(String titulo) {

        if (inicio == null) {
            System.out.println("Playlist vazia.");
            return;
        }

        NoMusica aux = inicio;

        while (aux != null) {

            if (aux.musica.titulo.equalsIgnoreCase(titulo)) {

                if (aux == inicio && aux == fim) {
                    inicio = null;
                    fim = null;
                    atual = null;
                }

                else if (aux == inicio) {
                    inicio = inicio.proximo;
                    inicio.anterior = null;

                    if (atual == aux) {
                        atual = inicio;
                    }
                }

                else if (aux == fim) {
                    fim = fim.anterior;
                    fim.proximo = null;

                    if (atual == aux) {
                        atual = fim;
                    }
                }

                else {
                    aux.anterior.proximo = aux.proximo;
                    aux.proximo.anterior = aux.anterior;

                    if (atual == aux) {
                        atual = aux.proximo;
                    }
                }

                System.out.println("Música removida.");
                return;
            }

            aux = aux.proximo;
        }

        System.out.println("Música não encontrada.");
    }

    public void ordenarTitulo() {

        if (inicio == null) return;

        NoMusica i = inicio;

        while (i != null) {
            NoMusica j = i.proximo;

            while (j != null) {

                if (i.musica.titulo.compareToIgnoreCase(j.musica.titulo) > 0) {
                    Musica temp = i.musica;
                    i.musica = j.musica;
                    j.musica = temp;
                }

                j = j.proximo;
            }

            i = i.proximo;
        }

        System.out.println("Playlist ordenada por título.");
    }

    public void ordenarArtista() {

        if (inicio == null) return;

        NoMusica i = inicio;

        while (i != null) {
            NoMusica j = i.proximo;

            while (j != null) {

                if (i.musica.artista.compareToIgnoreCase(j.musica.artista) > 0) {
                    Musica temp = i.musica;
                    i.musica = j.musica;
                    j.musica = temp;
                }

                j = j.proximo;
            }

            i = i.proximo;
        }

        System.out.println("Playlist ordenada por artista.");
    }
}
