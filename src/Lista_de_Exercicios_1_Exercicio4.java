import java.util.Scanner;

public class Lista_de_Exercicios_1_Exercicio4 {
    public static void main(String[] args) {
        Scanner atividade = new Scanner (System.in);
    
//Entrada 

    System.out.println("Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário,\n" +
"sabendo-se que sofreu um aumento de 25%");
        System.out.println("");
        
        System.out.println("Coloque o salário:");
        double sala1 = atividade.nextDouble();
        
        //Processo
        double salaa = sala1*1.25;
                
        //Saída
        System.out.println(" O salario almentado será de:" + salaa);
    
    
}
}

