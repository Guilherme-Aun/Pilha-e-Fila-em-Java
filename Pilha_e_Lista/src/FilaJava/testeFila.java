package FilaJava;

public class testeFila {
    public static void main(String[] args) {
        interfaceFila fila = new implementacaoFila(5);

        fila.push(10);
        fila.push(20);
        fila.push(30);
        fila.push(40);
        fila.push(50);

        System.out.println("adicionar um elemento em fila cheia: ");
        fila.push(60);

        System.out.println("O elemento mais antigo é: " + fila.peek());

        System.out.println("removendo elementos: ");
        System.out.println("elemto removido: " + fila.pop());
        System.out.println("elemto removido: " + fila.pop());

        System.out.println("adiconando mais elementeos: ");
        fila.push(70);
        fila.push(80);

        System.out.println("removendo mais elementos:");
        System.out.println("elemto removido: " + fila.pop());
        System.out.println("elemto removido: " + fila.pop());

        System.out.println("O elemento mais antigo agora é: " + fila.peek());
    }
}
