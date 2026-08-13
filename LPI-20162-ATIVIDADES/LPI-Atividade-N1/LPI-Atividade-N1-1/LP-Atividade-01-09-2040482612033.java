import java.util.Scanner;

public class LP_Atividade_01_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a nota final do aluno: ");
        double notaFinal = sc.nextDouble();

        String situacaoIfElse;
        if (notaFinal >= 6.0) {
            situacaoIfElse = "Aprovado";
        } else {
            situacaoIfElse = "Reprovado";
        }

        System.out.println("\n--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
        System.out.println("Situação (if-else): " + situacaoIfElse);

        String situacaoTernario = (notaFinal >= 6.0) ? "Aprovado" : "Reprovado";

        System.out.println("\n--- Abordagem 2: Operador Ternário Simples ---");
        System.out.println("Situação (Ternário): " + situacaoTernario);

        sc.close();
    }
}

//EXEMPLO DE TERNÁRIO ENCADEADO: 
//String status = (notaFinal >= 6.0) ? "Aprovado" : (notaFinal >= 4.0) ? "Exame" : "Reprovado";

//PORQUE EVITAR: Escrever muitos ternários em sequência deixa o código confuso e difícil de ler.

