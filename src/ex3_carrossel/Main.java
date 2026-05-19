package ex3_carrossel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carrossel carrossel = new Carrossel();

        int opcao;
        int id = 1;

        do {
            System.out.println("1 - Exibir e avançar");
            System.out.println("2 - Adicionar anúncio");
            System.out.println("3 - Remover anúncio");
            System.out.println("4 - Listar ciclo completo");
            System.out.println("5 - Exibição automática");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    carrossel.exibirAvancar();
                    break;

                case 2:
                    System.out.print("Empresa: ");
                    String empresa = sc.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();

                    Anuncio novo = new Anuncio(id++, empresa, descricao);
                    carrossel.adicionar(novo);

                    System.out.println("Anúncio adicionado.");
                    break;

                case 3:
                    System.out.print("ID para remover: ");
                    int remover = sc.nextInt();
                    sc.nextLine();

                    carrossel.remover(remover);
                    break;

                case 4:
                    carrossel.listarCiclo();
                    break;

                case 5:
                    System.out.print("Quantidade de anúncios para exibir: ");
                    int qtd = sc.nextInt();
                    sc.nextLine();

                    carrossel.exibirAutomatico(qtd);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}