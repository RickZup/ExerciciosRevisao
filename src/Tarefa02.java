import java.util.Scanner;

public class Tarefa02 {
    public static void main(String[] args) {

        int numeroDigitado = 0;
        int resultado = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá! Me diga um número e, se for par vou somar mais 5, se for impar vou somar mais 8!");
        System.out.println("----------------------------");

        System.out.println("Insira um número, por favor:");
        numeroDigitado = entrada.nextInt();

        System.out.println();
        System.out.println("-----------------------------------------");

        if (numeroDigitado % 2 == 0){
            resultado = numeroDigitado + 5;
            System.out.println("O numero que você digitou + 5 é igual a: " + resultado);
        } else {
            resultado = numeroDigitado + 8;
            System.out.println("O número que você digitou + 8 é igual a: " + resultado);
        }
    }
}
