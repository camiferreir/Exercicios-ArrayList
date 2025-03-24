package removendo.elementos.repetidos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemovendoElementosRepetidos {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 6));

        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        List<Integer> resultList = new ArrayList<>(uniqueNumbers);

        System.out.println("Lista sem elementos duplicados: " + resultList);
    }
}