package ex1_cafeteria;

public class PilhaCancelados {
    private NoPedido topo;

    public PilhaCancelados() {
        topo = null;
    }

    public void push(Pedido pedido) {
        NoPedido novo = new NoPedido(pedido);
        novo.proximo = topo;
        topo = novo;
    }

    public Pedido pop() {
        if (topo == null) {
            return null;
        }

        Pedido removido = topo.pedido;
        topo = topo.proximo;
        return removido;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void printStack() {
        if (topo == null) {
            System.out.println("Nenhum pedido cancelado.");
            return;
        }

        NoPedido atual = topo;

        while (atual != null) {
            System.out.println(atual.pedido);
            atual = atual.proximo;
        }
    }
}
