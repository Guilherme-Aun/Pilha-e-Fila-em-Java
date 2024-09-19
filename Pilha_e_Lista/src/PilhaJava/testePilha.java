package PilhaJava;

public class testePilha {
    public static void main(String[] args) {
        InterfacePilha<Integer> pilha = new implementacaoPilha<>(2);

        pilha.add(10);
        pilha.add(20);
        System.out.println("Topo da pilha: " + pilha.peek());

        pilha.add(30);
        System.out.println("Topo da pilha adicionando o 30: " + pilha.peek());

        System.out.println("Removendo da pilha: " + pilha.poll());
        System.out.println("Topo da pilha após remover: " + pilha.peek());

        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        pilha.poll();
        pilha.poll();
        System.out.println("A pilha está vazia? " + pilha.isEmpty());

    }

}
