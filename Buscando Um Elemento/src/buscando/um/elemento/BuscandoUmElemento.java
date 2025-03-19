package buscando.um.elemento;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscandoUmElemento {

    public static void main(String[] args) {

        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Arroz");
        produtos.add("Feijao");
        produtos.add("Macarrao");
        produtos.add("Açucar");
        produtos.add("Cafe");

        try (
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o nome do produto que deseja buscar: ");

            String produtoBusca = scanner.nextLine();

            if (produtos.contains(produtoBusca)) {
                System.out.println("O produto " + produtoBusca + " está na lista.");
            } else {
                System.out.println("O produto " + produtoBusca + " não foi encontrado na lista.");
            }
            scanner.close();
        }
    }
}
