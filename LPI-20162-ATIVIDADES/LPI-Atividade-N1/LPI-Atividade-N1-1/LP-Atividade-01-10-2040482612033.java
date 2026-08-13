import java.util.Scanner;

public class LP-Atividade-01-10-2040482612033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor A: ");
        double a = sc.nextDouble();

        System.out.print("Informe o valor B: ");
        double b = sc.nextDouble();

        System.out.print("Informe o valor C: ");
        double c = sc.nextDouble();

        System.out.print("Informe o valor D: ");
        double d = sc.nextDouble();
        
        System.out.print("Informe a média do aluno: ");
        double media = sc.nextDouble();
        
        System.out.print("Informe o percentual de presença: ");
        double presenca = sc.nextDouble();

        double semParentesesFinal = a + b - c * d / 2;
        double comParentesesFinal = a + b - ((c * d) / 2);

        System.out.println("--- Demonstração de Precedência Aritmética ---");
        System.out.println("Resultado Sem parênteses: " + semParentesesFinal);
        System.out.println("Resultado Com parênteses explícitos: " + comParentesesFinal);
        System.out.println(
                "Nota: Ambos dão o mesmo resultado pela precedência natural (*, / depois +), mas a segunda forma é mais legível.");

        boolean aprovadoDireto = (media >= 6) && (presenca >= 75);

        System.out.println("--- Validação do Critério de Aprovação ---");
        System.out.println("Entrada -> Média: " + media + " | Presença: " + (int) presenca + "%");
        System.out.println("Resultado da avaliação (aprovadoDireto): " + aprovadoDireto);

        sc.close();
    }
}