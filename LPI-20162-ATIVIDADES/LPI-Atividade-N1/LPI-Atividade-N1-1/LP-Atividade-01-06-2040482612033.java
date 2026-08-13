import java.util.Scanner;

public class Exercício06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome de usuário: ");
        String texto = sc.nextLine();

        if (texto != null && texto.length() > 0) {
            System.out.println("Usuário válido fornecido: " + texto);
        } else {
            System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
        }

        sc.close();
    }
}

//O operador '&' valida todas as condições. Se 'texto' for null, ele tenta rodar .length() em seguida e lança NullPointerException.

// O '&&' usa curto-circuito: se 'texto != null' for falso, ele para a checagem imediatamente e não executa o .length(), evitando o erro.
