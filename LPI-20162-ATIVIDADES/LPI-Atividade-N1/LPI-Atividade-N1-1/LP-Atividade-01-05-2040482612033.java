import java.util.Scanner;
public class LP-Atividade-01-05-2040482612033 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Estoque inicial: ");
    int estoque = sc.nextInt();

    System.out.print("Quantidade de entrada: ");
    int qtdEntrada = sc.nextInt();

    System.out.print("Quantidade de saída 1: ");
    int qtdSaida1 = sc.nextInt();

    System.out.print("Quantidade de saída 2: ");
    int qtdSaida2 = sc.nextInt();

    System.out.print("Estoque mínimo: ");
    int estoqueMinimo = sc.nextInt();

    System.out.print("Tamanho do lote (caixa): ");
    int tamanhoLote = sc.nextInt();

    System.out.println("Estoque inicial: " +estoque+ " unidades.");

    estoque += qtdEntrada;
    System.out.println("Após entrada (+" + qtdEntrada +"): " + estoque + " unidades.");

    estoque -= qtdSaida1;
    System.out.println("Após saída (-"+qtdSaida1+"): " + estoque + " unidades.");

    estoque -= qtdSaida2;
    System.out.println("Após outra saida (-"+qtdSaida2+"): " + estoque + " unidades. " );

    boolean abaixoMin = estoque < estoqueMinimo;
    System.out.println("O nível de estoque atual ("+estoque+") está abaixo do mínimo ("+estoqueMinimo+")? "+abaixoMin);

    int unidadesForaCaixa = estoque % tamanhoLote;
    System.out.println("Unidades fora de caixas fechadas de "+tamanhoLote+": "+ unidadesForaCaixa);

    boolean caixasCompletas = (unidadesForaCaixa == 0);
    System.out.println("O estoque está perfeitamente fracionado em caixas completas? " + caixasCompletas);

    sc.close();
    }
}