package criando.um.arraylist;

import java.util.ArrayList;

public class CriandoUmArrayList {

    public static void main(String[] args) {

        ArrayList<String> NumerosInteiros = new ArrayList<>();

        NumerosInteiros.add("valor 1");
        NumerosInteiros.add("valor 2");
        NumerosInteiros.add("valor 3");
        NumerosInteiros.add("valor 4");
        NumerosInteiros.add("valor 5");

        for (int i = 0; i < NumerosInteiros.size(); i++) {
            System.out.println("Numero #" + i + ": " + NumerosInteiros.get(i));
        }

    }
}
