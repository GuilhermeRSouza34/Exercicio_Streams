import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltarMulheres {
    public static void main(String[] args) {
        List<String> listaNomes = Arrays.asList("Maria - Feminino", "Pedro - Masculino", "Carlos - Masculino",
                "Amanda - Feminino");
        List<String> mulheres = listaNomes.stream()
                .filter(nome -> nome.contains("Feminino"))
                .collect(Collectors.toList());

        System.out.println("Lista Original: " + listaNomes);
        System.out.println("Lista de Mulheres: " + mulheres);
    }
}