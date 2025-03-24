package somando.valores.arraylist;

import java.util.ArrayList;

public class SomandoValoresArrayList {

    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();

        numeros.add(10.2);
        numeros.add(8.3);
        numeros.add(28.4);
        numeros.add(44.9);

        double soma = 0;
        for (double num : numeros) {
            soma += num;

        }
        System.out.println("a soma dos numeros é: " + soma);
    }
}