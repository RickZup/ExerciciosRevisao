import java.util.*;

public class Tarefa04 {
    public static void main(String[] args) {

        Map<String, Integer> listaIdades = new HashMap<>();
        Scanner entrada = new Scanner(System.in);

        String nome = null;
        int idade = 0;
        int soma = 0;
        int media = 0;

        System.out.println("Vamos calcular juntos a média da idade de 20 pessoas?");
        System.out.println("Então bora!");
        System.out.println("-----------------------------------------------------");
        System.out.println();

        for (int i = 0; i < 20; i++){
            System.out.println("Qual o nome da pessoa?");
            nome = entrada.next();
            System.out.println("E a idade dela?");
            idade = entrada.nextInt();
            listaIdades.put(nome, idade);
            soma = soma + idade;
        }

        System.out.println();
        System.out.println("--------------------------------------");
        media = soma / 20;
        System.out.println("A média das idades é igual a: " + media);

    }
}
