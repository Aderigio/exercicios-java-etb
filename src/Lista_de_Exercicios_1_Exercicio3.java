import java.util.Scanner;
public class Lista_de_Exercicios_1_Exercicio3 {
    
    public static void main(String[] args) {
        Scanner atividade = new Scanner (System.in);
        
        //Entrada
        
        System.out.println("Faça um programa que receba 3 notas e os seus respectivos pesos, calcule e mostre a média\n" +
"ponderada.");
        System.out.println("");
        
        System.out.println("Entre com a primeria nota:");
        double nota1 = atividade.nextDouble();
        System.out.println("Entre com o peso da primeira nota");
        double peso1 = atividade.nextDouble();
                
        System.out.println("Entre com a segunda nota:");
        double nota2 = atividade.nextDouble();
        System.out.println("Entre com o peso da segunda nota");
        double peso2 = atividade.nextDouble();
        
        System.out.println("Entre com a terceira nota:");
        double nota3 = atividade.nextDouble();
        System.out.println("Entre com o peso da terceira nota");
        double peso3 = atividade.nextDouble();
        
        //processo
        
        double pesosoma = peso1 + peso2 + peso3;
        
        double media = (nota1 + nota2 + nota3)/pesosoma;
        
        //saída
        
        System.out.println("A media da nota é: " + media);
        
        
    }
    
}
