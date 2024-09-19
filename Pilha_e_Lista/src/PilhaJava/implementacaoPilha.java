package PilhaJava;

import java.util.Arrays;

public class implementacaoPilha<T> implements InterfacePilha<T> {

    private T[] elementos;
    private int tamanho;
    private int capacidade;

    public implementacaoPilha(int capacidadeInicial) {
        this.capacidade = capacidadeInicial;
        this.elementos = (T[]) new Object[capacidadeInicial];
        this.tamanho = 0;
    }

    @Override
    public void add(T item) {
        if (tamanho == capacidade) {
            aumentaCapacidade();
        }
        elementos[tamanho++] = item;
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            return null;
        }
        T item = elementos[--tamanho];
        elementos[tamanho] = null;
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return elementos[tamanho - 1];
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    private void aumentaCapacidade() {
        capacidade *= 2;
        T[] novoArray = (T[]) new Object[capacidade];

        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = elementos[i];
        }

        elementos = novoArray;

    }

}
