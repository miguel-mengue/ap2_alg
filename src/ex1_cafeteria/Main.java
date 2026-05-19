package ex1_cafeteria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FilaPedidos fila = new FilaPedidos();
        PilhaCancelados pilha = new PilhaCancelados();

        int opcao;
        int id = 1;

        do {
            System.out.println("1 - Adicionar pedido");
            System.out.println("2 - Atender pedido");
            System.out.println("3 - Cancelar pedido");
            System.out.println("4 - Restaurar pedido");
            System.out.println("5 - Pedidos pendentes");
            System.out.println("6 - Pedidos cancelados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Descrição do pedido: ");
                    String descricao = sc.nextLine();

                    Pedido novo = new Pedido(id++, descricao);
                    fila.enqueue(novo);

                    System.out.println("Pedido adicionado: " + novo);
                    break;

                case 2:
                    Pedido atendido = fila.dequeue();

                    if (atendido == null) {
                        System.out.println("Fila vazia.");
                    } else {
                        System.out.println("Pedido atendido: " + atendido);
                    }
                    break;

                case 3:
                    Pedido cancelado = fila.dequeue();

                    if (cancelado == null) {
                        System.out.println("Fila vazia.");
                    } else {
                        pilha.push(cancelado);
                        System.out.println("Pedido cancelado: " + cancelado);
                    }
                    break;

                case 4:
                    Pedido restaurado = pilha.pop();

                    if (restaurado == null) {
                        System.out.println("Nenhum pedido cancelado.");
                    } else {
                        fila.enqueue(restaurado);
                        System.out.println("Pedido restaurado: " + restaurado);
                    }
                    break;

                case 5:
                    System.out.println("\nPedidos Pendentes:");
                    fila.printQueue();
                    break;

                case 6:
                    System.out.println("\nPedidos Cancelados:");
                    pilha.printStack();
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
