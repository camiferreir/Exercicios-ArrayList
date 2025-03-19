package iterator.para.percorrer;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorParaPercorrer {

    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<>();

        numeros.add("10");
        numeros.add("20");
        numeros.add("30");
        numeros.add("40");
        numeros.add("50");

        Iterator<String> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}