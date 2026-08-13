import java.util.Scanner;

public class at4 {
    public static final String nome_Instituicao = "Fatec Ipiranga";
    public static final int prazo_Max_Dias = 14;

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de dias do empréstimo: ");
        final int diasEmprestimo = sc.nextInt();

        // Tentativa de reatribuição a uma variável final
        // diasEmprestimo = 5; // ERRO DE COMPILAÇÃO
        System.out.println("Instituição: " + nome_Instituicao);
        System.out.println("Prazo Máximo Padrão: " + prazo_Max_Dias + " dias.");

        final int diasCalculados = calcularDevolucao(diasEmprestimo);
        System.out.println("Dias calculados para devolução: " + diasCalculados);

        sc.close();
    }
    public static int calcularDevolucao(final int dias) {
        if (dias > prazo_Max_Dias) {
            return prazo_Max_Dias;
        }
        return dias;
    }
}
