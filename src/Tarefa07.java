import java.util.Scanner;

public class Tarefa07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome = null;
        int repeticoes = 0;

        System.out.println("Vamos nos divertir?");
        System.out.println("Vou mostrar seu nome quantas vezes você me pedir!");
        System.out.println("----------------------------");

        System.out.println("Primeiro digite seu nome:");
        nome = entrada.next();

        System.out.println("Quantas vezes quer que eu o diga?");
        repeticoes = entrada.nextInt();
        System.out.println("--------");

        for (int i = 0; i < repeticoes; i++){
            System.out.println(nome + "!");
        }
    }
}
