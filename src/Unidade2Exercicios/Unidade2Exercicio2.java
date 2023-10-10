package Unidade2Exercicios;

import java.util.Scanner;

public class Unidade2Exercicio2 {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner (System.in);
        
       
        
        System.out.println(" 2 - Faça um programa que receba o salário de um funcionário, se o salário for maior ou\n" +
"igual a R$ 1.000,00, mostre o salário mais R$ 100,00 de bônus, se for menor do que R$\n" +
"1.000,00, o bônus será de R$ 50,00. Mostre o novo salário (condicional ? if...else)\n\n\n\n");
        
         //entrada
         double salarionovo; 
         System.out.println("Digite o salário do funcionário: \n");
        double salario = exercicio.nextDouble();
        
        //processamento 
        
        if (salario >= 1000){
            salarionovo = salario+100; 
            System.out.println(" O novo salário é: " + salarionovo );
        } else if (salario < 1000) {
            salarionovo = salario+50;
            System.out.println(" O novo salário é: " + salarionovo ); 
    }
         
         
    }
    
}
