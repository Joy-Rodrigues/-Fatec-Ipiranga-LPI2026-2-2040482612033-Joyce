import java.util.Scanner;
public class LP_Atividade_N2_2_2040482612033
{
	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	
	double valorVenda = 0;
	double totalVenda = 0;
	int qtdVendas = 0;
	
	System.out.print("--- Execução 1 (com vendas) --- "); 
	
	do { 
	System.out.print("\nValor da venda (ou 0 para encerrar): "); 
	valorVenda = s.nextDouble(); 
	
	if (valorVenda != 0 ){
	totalVenda = totalVenda + valorVenda;
    qtdVendas = qtdVendas + 1;
	}
	
	} while (valorVenda != 0);
	
	if (qtdVendas > 0){ 
	
	double media = totalVenda / qtdVendas;
    System.out.printf("\nTotal vendido no turno: R$ %.2f%n", totalVenda);
    System.out.println("\nQuantidade de vendas: " + qtdVendas);
    System.out.printf("\nValor médio por venda: R$ %.2f%n", media);
    }
    
    else {
    System.out.println("Nenhuma venda registrada nesta sessão de caixa.");
	}
	
	s.close();
	}
}
