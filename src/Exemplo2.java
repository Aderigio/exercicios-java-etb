
import java.util.Scanner;

public class Exemplo2 {

public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Digite um número");
    int numero = leia.nextInt();
    
    if (numero >= 0) {
        System.out.println(" O número " + numero + " é positivo");
    } else {
        System.err.println(" O número " + numero + " é Negativo");
    }
    
    System.out.println(" Volte Sempre");
}
    
}
