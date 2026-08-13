import java.util.Scanner;

public class LP-Atividade-01-08-2040482612033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor total da compra em reais: ");
        double valorTotalReais = sc.nextDouble();

        System.out.print("Informe o numero de parcelas: ");
        int numeroParcelas = sc.nextInt();

        long valorCentavos = Math.round(valorTotalReais * 100);

        System.out.println("--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");
        System.out.println("Valor total convertido: " + valorCentavos + " centavos.");

        long parcelaCentavos = valorCentavos / numeroParcelas;
        System.out.println("Divisao de R$" + String.format("%.2f", valorTotalReais) + " por " + numeroParcelas + " em centavos: " + parcelaCentavos + " centavos por parcela.");

        double valorExibicao = parcelaCentavos / 100.0;
        System.out.println("Valor convertido para exibição: R$ " + String.format("%.2f", valorExibicao));

        sc.close();
    }
}

// Vantagens: Alta performance, menor consumo de memória e operações aritméticas nativas do processador.

 //Desvantagens: Perda do resto em divisões não exatas (ex: sobra de centavos no parcelamento) e risco de estouro de limite (overflow) em valores extremamente altos.