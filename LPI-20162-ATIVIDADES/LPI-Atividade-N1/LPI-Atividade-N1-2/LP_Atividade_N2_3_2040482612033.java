import java.util.Scanner;

public class LP_Atividade_N2_3_2040482612033 {

public static final int PIN = 1234;
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int pinDig = 0;
int tentativas = 0;

while (pinDig != PIN) {
System.out.print("Informe o PIN de acesso: ");
pinDig = s.nextInt();
tentativas++;
if (pinDig != PIN) {
System.out.println("PIN incorreto. Tente novamente.");
}
}
System.out.println("Acesso concedido! Você utilizou " + tentativas + " tentativa(s).");

        s.close();
    }
}