
package Unidade2Exercicios;

import java.util.Scanner;

public class Unidade2ExemploPg34 {
    public static void main(String[] args) {
        Scanner exemplo = new Scanner (System.in);
        
        
        //Declarando Vari�veis
        
        double nota1, nota2, media;
        
        int contador;
        
        //estrutura de repati��o - for
        
        for (contador=0; contador<=20; contador++)
        {
            System.out.println("Digite duas notas Abaixo\n\n\n");
            System.out.println("Digite a primeira nota\n");
            nota1 = exemplo.nextDouble();
            System.out.println("Digite a segunda nota\n");
            nota2 = exemplo.nextDouble();
            
       //processamento
       
       
            media = (nota1+nota2)/2;
            
            
            //Sa�da
            
            
            System.out.println("O Aluno teve m�dia de: " + media);
            
    }
    }   
}
