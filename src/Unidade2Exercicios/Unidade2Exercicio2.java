package Unidade2Exercicios;

import java.util.Scanner;

public class Unidade2Exercicio2 {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner (System.in);
        
       
        
        System.out.println(" 2 - Fa�a um programa que receba o sal�rio de um funcion�rio, se o sal�rio for maior ou\n" +
"igual a R$ 1.000,00, mostre o sal�rio mais R$ 100,00 de b�nus, se for menor do que R$\n" +
"1.000,00, o b�nus ser� de R$ 50,00. Mostre o novo sal�rio (condicional ? if...else)\n\n\n\n");
        
         //entrada
         double salarionovo; 
         System.out.println("Digite o sal�rio do funcion�rio: \n");
        double salario = exercicio.nextDouble();
        
        //processamento 
        
        if (salario >= 1000){
            salarionovo = salario+100; 
            System.out.println(" O novo sal�rio �: " + salarionovo );
        } else if (salario < 1000) {
            salarionovo = salario+50;
            System.out.println(" O novo sal�rio �: " + salarionovo ); 
    }
         
         
    }
    
}
