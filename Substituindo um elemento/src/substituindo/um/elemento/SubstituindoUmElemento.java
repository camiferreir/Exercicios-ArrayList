package substituindo.um.elemento;

import java.util.ArrayList;
import java.util.Scanner;

public class SubstituindoUmElemento {

    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Curitiba");
        cidades.add("Salvador");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista de cidades: " + cidades);
        System.out.print("Digite o nome da cidade que deseja substituir: ");
        String cidadeAntiga = scanner.nextLine();

        if (cidades.contains(cidadeAntiga)) {
            System.out.print("Digite o nome da nova cidade: ");
            String novaCidade = scanner.nextLine();

            int indice = cidades.indexOf(cidadeAntiga);
            cidades.set(indice, novaCidade);

            System.out.println("Lista atualizada: " + cidades);
        } else {
            System.out.println("A cidade não foi encontrada na lista.");
        }

        scanner.close();
    }
}