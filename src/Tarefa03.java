import java.sql.SQLOutput;
import java.util.Scanner;

public class Tarefa03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos imprimir seu boletim desse semestre!");
        System.out.println("Fique tranquilo, eu farei tudo, só preciso de alguns dados...");
        System.out.println("-------------------------------------------------------------");

        System.out.println("Para começar, infrme sua mátricula com 4 digitos:");
        int matricula = entrada.nextInt();

        System.out.println("Insira a nota da prova 1:");
        double nota1 = entrada.nextDouble();

        System.out.println("Agora a nota da prova 2:");
        double nota2 = entrada.nextDouble();

        System.out.println("Da prova 3:");
        double nota3 = entrada.nextDouble();

        System.out.println("Agora a a média de exercícios:");
        double mediaExercicios = entrada.nextDouble();
        System.out.println();

        double mediaMA = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;

        System.out.println("BOLETIM DO ALUNO - 2º SEMESTRE - 2023");
        System.out.println("-------------------------------------");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Terceira nota: " + nota3);
        System.out.println("ME: " + mediaExercicios);
        System.out.println("MA: " + mediaMA);
        System.out.println();
        System.out.println("-------------------------------------");


        if (mediaMA >= 9){
            System.out.println("Seu conceito é A. VocÊ foi aprovado!");
        } else if (mediaMA >= 7.5 && mediaMA < 9) {
            System.out.println("Seu conceito é B. VocÊ foi aprovado!");
        } else if (mediaMA >= 6 && mediaMA < 7.5) {
            System.out.println("Seu conceito é C. VocÊ foi aprovado!");
        } else if (mediaMA >= 4 && mediaMA < 6) {
            System.out.println("Seu conceito é D. VocÊ foi reprovado.");
        } else {
            System.out.println("Seu conceito é E. VocÊ foi reprovado.");
        }

        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("LEGENDA:");
        System.out.println("ME -> Média de exercícios.");
        System.out.println("MA -> Média de aroveitamento.");
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("BOAS FÉRIAS!");
        System.out.println("Nos vemos no próximo semestre!");


    }
}
