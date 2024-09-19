package PilhaListaLigadaJava;

public class TestePilhaLinkedList {
    public static void main(String[] args) {
        PilhaLinkedList<Integer> pilha = new PilhaLinkedList<>();

        // Testando push
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        System.out.println("Topo da pilha: " + pilha.peek()); // Deve retornar 30

        // Testando pop
        System.out.println("Removido da pilha: " + pilha.pop()); // Deve remover e retornar 30
        System.out.println("Novo topo da pilha: " + pilha.peek()); // Deve retornar 20

        // Testando isEmpty
        System.out.println("A pilha está vazia? " + pilha.isEmpty()); // Deve retornar false

        // Removendo os elementos restantes
        pilha.pop(); // Remove 20
        pilha.pop(); // Remove 10

        // Verificando se a pilha está vazia
        System.out.println("A pilha está vazia? " + pilha.isEmpty()); // Deve retornar true
    }
}