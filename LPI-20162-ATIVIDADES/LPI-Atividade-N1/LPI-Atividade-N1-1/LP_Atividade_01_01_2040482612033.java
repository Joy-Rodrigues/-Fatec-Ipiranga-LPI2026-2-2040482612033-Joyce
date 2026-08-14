import java.util.Scanner;
public class LP_Atividade_01_01_2040482612033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // byte: 8 bits | Intervalo: -128 a 127 
        System.out.print("Idade do Aluno: ");
        byte idade = sc.nextByte();

        // short: 16 bits | Intervalo: -32.768 a 32.767
        System.out.print("Número de Faltas: ");
        short faltas = sc.nextShort();

        // int: 32 bits | Intervalo: -2.147.483.648 a 2.147.483.647
        System.out.print("Matrícula ID: ");
        int matriculaId = sc.nextInt();

        // long: 64 bits | Intervalo: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        System.out.print("Codigo Nacional do Estudante: ");
        long codigoNacional = sc.nextLong();

        // float: 32 bits | Intervalo: ±1,4 × 10⁻⁴⁵ a ±3,4 × 10³⁸ (~7 dígitos decimais)
        System.out.print("Nota do Trabalho: ");
        float notaTrabalho = sc.nextFloat();
        
        // double: 64 bits | Intervalo:  ±4,9 × 10⁻³²⁴ até ± 1,79 × 10³⁰⁸ (~15 dígitos)
        System.out.print("Nota da Prova Final: ");
        double notaProvaFinal = sc.nextDouble();

        // char: 16 bits | Intervalo: 0 a 65.535 (Unicode)
        System.out.print("Conceito Final do Aluno: ");
        char conceitoFinal = sc.next() .charAt(0);

        // boolean: depende da JVM | Intervalo: true ou false
        System.out.print("Aluno esta Aprovado (true/false): ");
        boolean aprovado = sc.nextBoolean();

        System.out.println("--- Dados do Aluno fictício ---");
        System.out.println("Idade do Aluno: " +idade);
        System.out.println("Número de Faltas: " +faltas);
        System.out.println("Matrícula ID: " +matriculaId);
        System.out.println("Codigo Nacional do Estudante: " +codigoNacional);
        System.out.println("Nota do Trabalho: " +notaTrabalho);
        System.out.println("Nota da Prova Final: " +notaProvaFinal);
        System.out.println("Conceito Final do Aluno: " +conceitoFinal);
        System.out.println("Aluno está Aprovado? " +aprovado);

        sc.close();
    }
}
