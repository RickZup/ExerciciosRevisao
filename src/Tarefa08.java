import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int salarioDigitado = 0;
        double reajuste = 0;
        double calculandoAumento = 0;
        double salarioReajustado = 0;

        List<Double> listaDeSalarios = new ArrayList<>();
        List<Double> listaReajuste = new ArrayList<>();

        System.out.println("Vamos deixar os colaboradores felizes?");
        System.out.println("Me informe quantos salários quiser!");
        System.out.println("Depois diga quanto de reajuste eles sofrerão...");
        System.out.println("E a mágica estará feita! Direi quais os novos salários dos nosso Zuppers!");
        System.out.println("Quando não quiser mais adicionar salários, digite -1");
        System.out.println("---------------------------");

        for (int i = 1; i >= 0; i++){

            System.out.println("Digite o " + i + "º salário!");
            salarioDigitado = entrada.nextInt();

            if (salarioDigitado >= 0){
                listaDeSalarios.add((double) salarioDigitado);
            } else {
                break;
            }
        }

        System.out.println("Qual será o valor de reajuste dos salários? (O que felizes os Zuppers ficarão? Hahaha!)");
        System.out.println("Digite somente o número de quantos % será alterado!");
        reajuste = entrada.nextDouble();

        double porcentagemReajuste = reajuste / 100;

        for (int i = 0; i < listaDeSalarios.size(); i++){
            calculandoAumento = listaDeSalarios.get(i) * porcentagemReajuste;
            salarioReajustado = listaDeSalarios.get(i) + calculandoAumento;
            listaReajuste.add(salarioReajustado);
        }

        System.out.println("Os salários antigos são: " + listaDeSalarios);
        System.out.println("E com reajuste ficaram assim: " + listaReajuste);

    }
}
