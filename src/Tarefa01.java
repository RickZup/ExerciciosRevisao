import java.util.Scanner;

public class Tarefa01 {
    public static void main(String[] args) {

        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Olá! Nesse sistema você irá inserir dois números inteiros!");
        System.out.println("Se eles forem iguais, vou somá-los, caso contrário irei multiplicá-los.");
        System.out.println("No fim, irei mostrar o resultado da operação ocorrida!");
        System.out.println("Vamos começar?");

        System.out.println("-------------------------");
        System.out.println("Insira o primeiro número:");
        numero1 = entrada.nextInt();

        System.out.println("-----------------------");
        System.out.println("Agora o segundo número:");
        numero2 = entrada.nextInt();
        System.out.println("-----------------------");

        if (numero1 == numero2){
            resultado = numero1 + numero2;
            System.out.println("A soma deles é igual a: " + resultado);
        } else {
            resultado = numero1 * numero2;
            System.out.println("A multiplicação entre eles é igual a: " + resultado);
        }
    }
}
