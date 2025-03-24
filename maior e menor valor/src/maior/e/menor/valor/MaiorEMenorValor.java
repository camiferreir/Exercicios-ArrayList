package maior.e.menor.valor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaiorEMenorValor {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(20, 8, 6, 30, 9, 50));

        int menor = Collections.min(numeros);
        int maior = Collections.max(numeros);

        System.out.println("O menor valor:" + menor);
        System.out.println("O maior valor: " + maior);
    }
}