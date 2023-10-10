
package Unidade2Exercicios;

import java.util.Scanner;

public class Unidade2Exercicio3 {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner (System.in);
        
        //Texto do Exerc�cio 
        System.out.println("Fa�a um programa que receba dois n�meros e execute as op��es abaixo, de acordo\n" +
"com a escolha do usu�rio: (fa�a usando a condicional ? switch)\n" +
"1 ? M�dia entre os n�meros digitados\n" +
"2 ? Produto (multiplica��o) entre os n�meros digitados\n" +
"3 ? Divis�o do primeiro pelo segundo\n" +
"4 ? Diferen�a do maior pelo menor\n" +
"Se a op��o digitada for inv�lida, mostre uma mensagem de erro.");
        
        
        
        
        //Entrada
        System.out.println("Digite o primeiro n�mero: ");
        double numero1 = exercicio.nextDouble();
        
        System.out.println("Digite o segundo n�mero: ");
        double numero2 = exercicio.nextDouble();
        
        System.out.println("Escolha uma op��o: ");
        System.out.println("1 - M�dia entre os n�meros digitados");
        System.out.println("2 - Produto (multiplica��o) entre os n�meros digitados");
        System.out.println("3 - Divis�o do primeiro pelo segundo");
        System.out.println("4 - Diferen�a do maior pelo menor");
        
        int opcao = exercicio.nextInt();
        //precesso
        
        
        switch(opcao) {
            case 1:
                double media = (numero1 + numero2) / 2;
                System.out.println("A m�dia �: " + media);
                break;
            case 2:
                double produto = numero1 * numero2;
                System.out.println("O produto �: " + produto);
                break;
            case 3:
                if(numero2 == 0) {
                    System.out.println("N�o � poss�vel realizar a divis�o por zero.");
                } else {
                    double divisao = numero1 / numero2;
                    System.out.println("A divis�o do primeiro pelo segundo �: " + divisao);
                }
                break;
            case 4:
                double diferenca = Math.abs(numero1 - numero2);
                System.out.println("A diferen�a do maior pelo menor �: " + diferenca);
                break;
            default:
                System.out.println("Op��o inv�lida. Tente novamente.");
                break;
        }
        
        
        
        
        
    }
    
}
