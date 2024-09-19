package FilaListaLigada;

public class TesteFila_Lista_Ligada {
    public static void main(String[] args) {
        Fila_Lista_Ligada<Integer> fila = new Fila_Lista_Ligada<>();

        fila.push(10);
        fila.push(20);
        fila.push(30);

        System.out.println("Frente da fila: " + fila.peek()); // Deve exibir 10

        System.out.println("Removido da fila: " + fila.pop()); // Deve remover e exibir 10
        System.out.println("Frente da fila: " + fila.peek()); // Deve exibir 20

        fila.push(40);
        System.out.println("Removido da fila: " + fila.pop()); // Deve remover e exibir 20
        System.out.println("Frente da fila: " + fila.peek()); // Deve exibir 30

        System.out.println("Tamanho da fila: " + fila.size()); // Deve exibir 2
    }
}
