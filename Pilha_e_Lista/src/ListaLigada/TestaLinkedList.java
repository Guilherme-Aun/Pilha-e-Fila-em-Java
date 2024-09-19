package ListaLigada;

public class TestaLinkedList {
    public static void main(String[] args) {
        // Cria uma nova lista ligada de inteiros
        LinkedList<Integer> lista = new LinkedList<>();

        // Adiciona alguns elementos à lista
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        // Imprime a lista após adicionar elementos
        System.out.println("Lista após adicionar elementos:");
        lista.print(); // Esperado: 10 -> 20 -> 30 -> 40 -> 50 -> null

        // Remove um elemento da lista
        lista.remove(30);
        System.out.println("Lista após remover o valor 30:");
        lista.print(); // Esperado: 10 -> 20 -> 40 -> 50 -> null

        // Remove o cabeça da lista
        lista.remove(10);
        System.out.println("Lista após remover o valor 10:");
        lista.print(); // Esperado: 20 -> 40 -> 50 -> null

        // Remove um elemento que não está na lista
        lista.remove(100);
        System.out.println("Lista após tentar remover o valor 100:");
        lista.print(); // Esperado: 20 -> 40 -> 50 -> null

        // Adiciona elementos novamente
        lista.add(60);
        lista.add(70);
        System.out.println("Lista após adicionar os valores 60 e 70:");
        lista.print(); // Esperado: 20 -> 40 -> 50 -> 60 -> 70 -> null

        // Remove o último elemento adicionado
        lista.remove(70);
        System.out.println("Lista após remover o valor 70:");
        lista.print(); // Esperado: 20 -> 40 -> 50 -> 60 -> null
    }
}
