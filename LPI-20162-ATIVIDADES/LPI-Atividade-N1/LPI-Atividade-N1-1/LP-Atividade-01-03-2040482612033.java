import java.util.Scanner;

public class LP-Atividade-01-03-2040482612033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer idade = null;

        System.out.println("Tentando realizar operação aritmética com Integer nulo...");

        try{
            int teste = idade + 1;
            } catch (NullPointerException e) {
                System.out.println("Erro Capturado com sucesso: Não foi possível calcular porque a idade não foi informada (null).");
                System.out.println("Detalhe da exceção: " + e.getClass().getName());
            }

            System.out.println("Informe uma idade válida: ");
            int novaIdade = sc.nextInt();
            
            System.out.println("Reatribuindo valor válido para a variável...");
            idade = novaIdade; 

            int proxAno = idade + 1;
            System.out.println("Operação bem sucedida! Idade atual: " +idade+"| Idade no próximo ano: "+ proxAno);

            System.out.println();
            sc.close();
        }
    }