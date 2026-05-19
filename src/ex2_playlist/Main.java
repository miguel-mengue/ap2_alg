package ex2_playlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();

        int op;

        do {
            System.out.println("1 - Adicionar música");
            System.out.println("2 - Remover música");
            System.out.println("3 - Próxima música");
            System.out.println("4 - Música anterior");
            System.out.println("5 - Tocar música");
            System.out.println("6 - Listar músicas");
            System.out.println("7 - Ordenar por título");
            System.out.println("8 - Ordenar por artista");
            System.out.println("0 - Sair");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Artista: ");
                    String artista = sc.nextLine();

                    System.out.print("Álbum: ");
                    String album = sc.nextLine();

                    System.out.print("Duração (segundos): ");
                    int duracao = sc.nextInt();
                    sc.nextLine();

                    System.out.println("1-Início  2-Fim  3-Posição");
                    int escolha = sc.nextInt();
                    sc.nextLine();

                    Musica musica = new Musica(titulo, artista, album, duracao);

                    if (escolha == 1) {
                        playlist.adicionarInicio(musica);
                    } else if (escolha == 2) {
                        playlist.adicionarFim(musica);
                    } else {
                        System.out.print("Posição: ");
                        int pos = sc.nextInt();
                        sc.nextLine();
                        playlist.adicionarPosicao(musica, pos);
                    }

                    break;

                case 2:
                    System.out.print("Título para remover: ");
                    String remover = sc.nextLine();
                    playlist.removerTitulo(remover);
                    break;

                case 3:
                    playlist.proxima();
                    break;

                case 4:
                    playlist.anterior();
                    break;

                case 5:
                    playlist.tocar();
                    break;

                case 6:
                    playlist.listar();
                    break;

                case 7:
                    playlist.ordenarTitulo();
                    break;

                case 8:
                    playlist.ordenarArtista();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (op != 0);

        sc.close();
    }
}
