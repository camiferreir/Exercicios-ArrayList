package contando.ocorrências;

import java.util.ArrayList;
import java.util.Scanner;

public class ContandoOcorrências {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ContagemDePalavras = new ArrayList<>();

        System.out.println("Digite Palavras (Digite 'sair' para parar):");
        while (true) {
            String palavra = scanner.nextLine().trim();
            if (palavra.equalsIgnoreCase("sair")) {
                break;
            }
            ContagemDePalavras.add(palavra);

        }
        System.out.println("Digite a Palavra que deseja contar: ");
        String PalavrasParaContar = scanner.nextLine().trim();

        int contagem = 0;
        Iterable<String> Palavras = null;
       
        for (String Palavra : Palavras) {
            if (Palavra.equalsIgnoreCase(PalavrasParaContar)) {
                contagem++;

            }
        }
        System.out.println("A palavra' " + PalavrasParaContar + "' aparece " + contagem + " vezes na lista.");
        scanner.close();
    }

}