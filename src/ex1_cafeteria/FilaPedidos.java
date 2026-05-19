package ex1_cafeteria;

public class FilaPedidos {
    private NoPedido inicio;
    private NoPedido fim;

    public FilaPedidos() {
        inicio = null;
        fim = null;
    }

    public void enqueue(Pedido pedido) {
        NoPedido novo = new NoPedido(pedido);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }

    public Pedido dequeue() {
        if (inicio == null) {
            return null;
        }

        Pedido removido = inicio.pedido;
        inicio = inicio.proximo;

        if (inicio == null) {
            fim = null;
        }

        return removido;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void printQueue() {
        if (inicio == null) {
            System.out.println("Nenhum pedido pendente.");
            return;
        }

        NoPedido atual = inicio;

        while (atual != null) {
            System.out.println(atual.pedido);
            atual = atual.proximo;
        }
    }
}
