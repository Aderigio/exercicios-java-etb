
package Unidade2Exercicios;

import java.util.Scanner;

public class Unidade2Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       
       
        //Texto do exercÃ­cio        
        System.out.println("1 - Faça um programa que receba dois números e mostre o maior. (condicional - if)\n\n\n\n\n");
        
        // Entrada
        
        
        
        System.out.println("Entre com o primeiro número: \n");
        double numero1 = entrada.nextDouble();
        
        System.out.println("Entre com o segundo número: \n\n\n");
        double numero2 = entrada.nextDouble();
        
        
        //processo e resultado 
        
  
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.err.println("ERRO. Os números são iguais.");
             
    }
    }
}
