import java.util.Scanner;
public class Lista_de_Exercicios_1_Exercicio7 {
    public static void main(String[] args) {
        Scanner atividade = new Scanner(System.in);
        
        //Entrada
        
        System.out.println("Faça um programa que receba o salário base de um funcionário, calcule e mostre o seu\n" +
"salário a receber, sabendo-se que o funcionário tem gratificação de R$ 50 e imposto de 10%\n" +
"sobre o salário base.");
        System.out.println("Entre com o salário base: ");
        double salarioBase = atividade.nextDouble();
        
        //processo
        
        double imposto = salarioBase*0.1;
        double salarioFinal = (salarioBase + 50 - imposto);
        
        //Saída
        
        System.out.println(" O salario final será:" + salarioFinal);
        
    }
    
}
