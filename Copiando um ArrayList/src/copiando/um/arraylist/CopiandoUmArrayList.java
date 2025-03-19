package copiando.um.arraylist;

import java.util.ArrayList;

public class CopiandoUmArrayList {

    public static void main(String[] args) {
        ArrayList<String> listaOriginal = new ArrayList<>();

        listaOriginal.add("joana");
        listaOriginal.add("pedro");
        listaOriginal.add("carlos");
        listaOriginal.add("camille");
        listaOriginal.add("giovana");

        ArrayList<String> ListaCopia = new ArrayList<>(listaOriginal);

        System.out.println("lista Original: " + listaOriginal);
        System.out.println("Lista Copia: " + ListaCopia);
    }
}