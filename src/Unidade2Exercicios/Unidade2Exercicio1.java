
package Unidade2Exercicios;

import java.util.Scanner;

public class Unidade2Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       
       
        //Texto do exercício        
        System.out.println("1 - Fa�a um programa que receba dois n�meros e mostre o maior. (condicional - if)\n\n\n\n\n");
        
        // Entrada
        
        
        
        System.out.println("Entre com o primeiro n�mero: \n");
        double numero1 = entrada.nextDouble();
        
        System.out.println("Entre com o segundo n�mero: \n\n\n");
        double numero2 = entrada.nextDouble();
        
        
        //processo e resultado 
        
  
        if (numero1 > numero2) {
            System.out.println("O maior n�mero �: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior n�mero �: " + numero2);
        } else {
            System.err.println("ERRO. Os n�meros s�o iguais.");
             
    }
    }
}
