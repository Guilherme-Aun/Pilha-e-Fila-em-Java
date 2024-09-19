package ListaLigada;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    // Adiciona um novo valor à lista
    public void add(T valor) {
        Node<T> novoNode = new Node<>(valor);
        if (head == null) {
            head = novoNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(novoNode);
        }
    }

    // Remove o primeiro nó com o valor especificado
    public void remove(T valor) {
        if (head == null) {
            return; // Lista vazia
        }

        // Caso especial: remover o nó cabeça
        if (head.getValor().equals(valor)) {
            head = head.getNext();
            return;
        }

        // Procura o nó a ser removido
        Node<T> current = head;
        while (current.getNext() != null && !current.getNext().getValor().equals(valor)) {
            current = current.getNext();
        }

        // Se encontrou o nó a ser removido
        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
    }

    // Imprime os valores da lista
    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.getValor() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
