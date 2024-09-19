package FilaListaLigada;

public class Fila_Lista_Ligada<T> {
    private Node<T> frente; // Referência para o primeiro elemento da fila
    private Node<T> tras; // Referência para o último elemento da fila
    private int tamanho; // Tamanho da fila

    public Fila_Lista_Ligada() {
        this.frente = null;
        this.tras = null;
        this.tamanho = 0;
    }

    // Método para adicionar um item à fila (enqueue)
    public void push(T item) {
        Node<T> novoNode = new Node<>(item);
        if (isEmpty()) {
            frente = novoNode; // Se a fila estiver vazia, o novo nó será o primeiro
            tras = novoNode; // E também será o último
        } else {
            tras.setNext(novoNode); // Adiciona o novo nó ao final
            tras = novoNode; // Atualiza o último nó da fila
        }
        tamanho++;
    }

    // Método para remover o item mais antigo da fila (dequeue)
    public T pop() {
        if (isEmpty()) {
            return null; // Retorna null se a fila estiver vazia
        }
        T valor = frente.getValor(); // Armazena o valor do nó da frente
        frente = frente.getNext(); // Avança para o próximo nó
        if (frente == null) {
            tras = null; // Se a fila ficou vazia, o último nó também é null
        }
        tamanho--;
        return valor; // Retorna o valor removido
    }

    // Método para visualizar o item mais antigo da fila sem removê-lo
    public T peek() {
        if (isEmpty()) {
            return null; // Retorna null se a fila estiver vazia
        }
        return frente.getValor(); // Retorna o valor do nó da frente
    }

    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Retorna o tamanho da fila
    public int size() {
        return tamanho;
    }
}
