package FilaJava;

import java.util.Arrays;

public class implementacaoFila implements interfaceFila {

    private int[] elementos;
    private int capacidade;
    private int tamanho;
    private int frente;
    private int tras;

    public implementacaoFila(int capacidadeInicial) {
        this.capacidade = capacidadeInicial;
        this.elementos = new int[capacidadeInicial];
        this.tamanho = 0;
        this.frente = 0;
        this.tras = -1;
    }

    @Override
    public void push(int item) {
        if (isFull()) {
            aumentaCapacidade();
        }
        tras = (tras + 1) % capacidade;
        elementos[tras] = item;
        tamanho++;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila está vazia");
        }
        int item = elementos[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return item;

    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila está vazia");
        }
        return elementos[frente];
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public boolean isFull() {
        return tamanho == capacidade;
    }

    private void aumentaCapacidade() {
        int novaCapacidade = capacidade * 2;
        int[] novoArray = new int[novaCapacidade];

        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = elementos[(frente + i) % capacidade];
        }

        elementos = novoArray;
        capacidade = novaCapacidade;
        frente = 0;
        tras = tamanho - 1;
    }

}
