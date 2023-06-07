import java.util.Scanner;

public class Tarefa06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroDigitado = 0;
        int soma = 0;

        System.out.println("Insira quantos números quiser e eu irei somá-los!");
        System.out.println("Quando não quiser mais inserir, digite qualquer número negativo.");
        System.out.println("------------------------------");

        for (int i = 1; i >= 0; i++){

            System.out.println("Digite o " + i + "º número");
            numeroDigitado = entrada.nextInt();

            if (numeroDigitado >= 0){
                soma = numeroDigitado + soma;
            } else {
                break;
            }

        }

        System.out.println("---------------------------");
        System.out.println("A soma dos números digitados é igual a: " + soma);

    }
}
