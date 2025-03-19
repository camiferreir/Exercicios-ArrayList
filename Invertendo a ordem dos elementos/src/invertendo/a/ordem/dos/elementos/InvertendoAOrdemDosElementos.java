package invertendo.a.ordem.dos.elementos;

import java.util.ArrayList;
import java.util.Collections;

public class InvertendoAOrdemDosElementos {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");

        System.out.println("ordem original:" + lista);

        Collections.reverse(lista);

        System.out.println("Ordem Inversa: " + lista);

    }

}
