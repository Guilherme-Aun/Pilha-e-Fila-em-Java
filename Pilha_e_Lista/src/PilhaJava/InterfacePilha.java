package PilhaJava;

public interface InterfacePilha<T> {
    void add(T item);

    T poll();

    T peek();

    boolean isEmpty();
}
