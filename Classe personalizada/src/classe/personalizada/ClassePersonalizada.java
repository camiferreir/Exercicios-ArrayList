package classe.personalizada;

import java.util.ArrayList;

public class ClassePersonalizada {

    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(new Aluno("Camille", 8.5));
        listaAlunos.add(new Aluno("Giovana", 7.0));
        listaAlunos.add(new Aluno("Pedro", 9.2));
        listaAlunos.add(new Aluno("Joao", 6.8));

        System.out.println("Lista de Alunos:");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }

        double somaNotas = 0;
        for (Aluno aluno : listaAlunos) {
            somaNotas += aluno.getNota();
        }
        double media = somaNotas / listaAlunos.size();
        System.out.printf("\nMédia das notas: %.2f\n", media);
    }
}
