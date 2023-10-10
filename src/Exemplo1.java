import java.util.Scanner;
public class Exemplo1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o número: ");
        int numero = leia.nextInt();
        if (numero>0) {
            System.out.println("O Número " + numero + " e maior que zero");
            
        }
        System.out.println("Volte Sempre");
    }
    
}
