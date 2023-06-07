import java.util.ArrayList;
import java.util.List;

public class Tarefa09 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(50);

        for (int i = 0; i < 50; i++){
            lista.add(i + 101);
        }

        System.out.println(lista);

    }
}
