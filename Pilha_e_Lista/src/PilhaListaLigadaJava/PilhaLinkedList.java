package PilhaListaLigadaJava;

public class PilhaLinkedList<T> {
    private Node<T> topo;

    public PilhaLinkedList() {
        this.topo = null;
    }

    // Adiciona um item ao topo da pilha (push)
    public void push(T item) {
        Node<T> novoNode = new Node<>(item);
        novoNode.setNext(topo); // Aponta o próximo do novo nó para o topo atual
        topo = novoNode; // Atualiza o topo da pilha para o novo nó
    }

    // Remove e retorna o item do topo da pilha (pop)
    public T pop() {
        if (topo == null) {
            System.out.println("A pilha está vazia");
            return null;
        }
        T valor = topo.getValor(); // Obtém o valor do topo
        topo = topo.getNext(); // Move o topo para o próximo nó
        return valor;
    }

    // Retorna o item do topo da pilha sem removê-lo (peek)
    public T peek() {
        if (topo == null) {
            System.out.println("A pilha está vazia");
            return null;
        }
        return topo.getValor(); // Retorna o valor do topo
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == null;
    }
}
