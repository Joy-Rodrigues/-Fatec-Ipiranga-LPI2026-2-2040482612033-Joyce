import java.util.Scanner;
public class att2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Valor para comparação de primitivos: ");
    int valorPrimitivo = sc.nextInt();

    System.out.print("Valor para comparação de objetos (new Integer): ");
    int valorObjeto = sc.nextInt();

    System.out.print("Valor dentro do Integer Cache (-128 a 127): ");
    int valorCache = sc.nextInt();

    System.out.print("Valor fora do integer Cache: ");
    int valorForaCache = sc.nextInt();

    int aPrimitivo = valorPrimitivo;
    int bPrimitivo = valorPrimitivo;
    System.out.println("--- Comparação de Primitivos (Int) ---");
    System.out.println("aPrimitivo == bPrimitivo: " + (aPrimitivo == bPrimitivo ));

    Integer aObjeto = new Integer(valorObjeto);
    Integer bObjeto = new Integer(valorObjeto);
    System.out.println("--- Comparação de Objetos via 'new Integer()'---");
    System.out.println("aObjeto == bObjeto (Identidade): "+ (aObjeto == bObjeto));
    System.out.println("aObjeto.equals(boBjeto) (Valor): "+ aObjeto.equals(bObjeto));

    Integer xCache = valorCache;
    Integer yCache = valorCache;
    Integer xForaCache = valorForaCache;
    Integer yForaCache = valorForaCache;

    System.out.println("--- Comparação com Autoboxing e Integer Cache ---");
    System.out.println("Dentro do Cache ("+ valorCache +") -> xCache == yCache: " + (xCache == yCache));
    System.out.println("Fora do Cache (" + valorForaCache + ") -> xForaCache == yForaCache: " + (xForaCache == yForaCache));
    System.out.println("Fora do Cache(" + valorForaCache + ") -> ForaCache.equals(yForaCache): " + xForaCache.equals(yForaCache));

    sc.close();
    }
}
