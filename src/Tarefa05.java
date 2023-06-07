import java.util.Scanner;

public class Tarefa05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double numeroDigitado = 0;
        int quantidadeDeNumeros = 0;

        System.out.println("Digite vinte números e eu direi quantos deles estão entre 0 e 100!");
        System.out.println("------------------------");

        for (int i = 0; i < 20; i++){

            System.out.println("Digite um número:");
            numeroDigitado = entrada.nextDouble();

            if (numeroDigitado > 0 && numeroDigitado < 100){
                quantidadeDeNumeros++;
            }
        }

        System.out.println("-----------------------------");
        System.out.println("A quantidade de números digitados que estão entre 0 e 100 é de: " + quantidadeDeNumeros + " números");

    }
}
