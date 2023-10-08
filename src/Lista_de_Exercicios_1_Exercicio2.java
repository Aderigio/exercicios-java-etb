import java.util.Scanner;
public class Lista_de_Exercicios_1_Exercicio2 {

    public static void main(String[] args) {
        Scanner atividade = new Scanner (System.in);
        
        //Entrada
        System.out.println("Faça um programa que receba 3 notas, calcule e mostre a média aritmética entre elas.");
        System.out.println(" ");
        System.out.println("Digite a primeira nota: ");
        double nota1 = atividade.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = atividade.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = atividade.nextDouble();
        
        //processo
        
        double media = (nota1 + nota2 + nota3)/3;
        
        //saida
        
        System.out.println(" A nota media é" + media);
    }
    
}
