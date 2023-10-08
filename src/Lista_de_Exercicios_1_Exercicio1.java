import java.util.Scanner;

public class Lista_de_Exercicios_1_Exercicio1 {
    
    public static void main(String[] args) {
        Scanner atividade = new Scanner (System.in);
                
        //Entrada
        System.out.println("Soma de numeros inteiros.");
        System.out.println(" ");
        System.out.println("Digite o primeiro numero: ");
        double num1 = atividade.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = atividade.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        double num3 = atividade.nextDouble();
        System.out.println("Digite o primeiro numero: ");
        double num4 = atividade.nextDouble();
        
        //Processamento 
        
        double soma = num1 + num2 + num3 + num4;
        
        //Saida
        
        System.out.println("Soma:" + soma);
        
        
            
    }
    
}
