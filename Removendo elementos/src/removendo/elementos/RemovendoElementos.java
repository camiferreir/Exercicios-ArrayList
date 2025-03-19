package removendo.elementos;

import java.util.ArrayList;

public class RemovendoElementos {

    public static void main(String[] args) {

        ArrayList<String> listaDeNomes = new ArrayList<>();

        listaDeNomes.add("Ana");
        listaDeNomes.add("Carlos");
        listaDeNomes.add("Bruna");
        listaDeNomes.add("Daniel");
        listaDeNomes.add("Eduardo");

        for (int i = 0; i < listaDeNomes.size(); i++) {
            System.out.println("Nome #" + i + ": " + listaDeNomes.get(i));
        }

        listaDeNomes.remove("Eduardo");

        System.out.println("Após remover Eduardo:");
        for (String Nome : listaDeNomes) {
            System.out.println(Nome);
        }
    }

}
