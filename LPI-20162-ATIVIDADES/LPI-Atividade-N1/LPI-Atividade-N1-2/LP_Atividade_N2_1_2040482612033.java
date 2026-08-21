//O 'for' é ideal pois o número de repetições é fixo e conhecido

import java.util.Scanner;

public class LP_Atividade_N2_1_2040482612033 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Quantidade de alunos na turma: ");
        int qtdAluno = s.nextInt();

        double notaAluno = 0;
        double somaNota = 0;
        double mediaNota = 0;
        double maiorNota = Double.MIN_VALUE;

        if (qtdAluno > 0) {
            for (int i = 0; i < qtdAluno; i++) {
                System.out.print("Nota do aluno " + (i + 1) + ": ");
                notaAluno = s.nextDouble();
                somaNota += notaAluno;

                if (notaAluno > maiorNota) {
                    maiorNota = notaAluno;
                }
            }

            mediaNota = somaNota / qtdAluno;

            System.out.println("\nSoma total das notas: " + somaNota);
            System.out.println("Média da turma: " + mediaNota);
            System.out.println("Maior nota da turma: " + maiorNota);
        } else {
            System.out.println("Quantidade de alunos inválida.");
        }

        s.close();
    }
}