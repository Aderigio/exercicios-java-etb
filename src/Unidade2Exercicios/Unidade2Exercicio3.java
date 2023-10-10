
package Unidade2Exercicios;

import java.util.Scanner;

public class Unidade2Exercicio3 {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner (System.in);
        
        //Texto do Exercício 
        System.out.println("Faça um programa que receba dois números e execute as opções abaixo, de acordo\n" +
"com a escolha do usuário: (faça usando a condicional ? switch)\n" +
"1 ? Média entre os números digitados\n" +
"2 ? Produto (multiplicação) entre os números digitados\n" +
"3 ? Divisão do primeiro pelo segundo\n" +
"4 ? Diferença do maior pelo menor\n" +
"Se a opção digitada for inválida, mostre uma mensagem de erro.");
        
        
        
        
        //Entrada
        System.out.println("Digite o primeiro número: ");
        double numero1 = exercicio.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        double numero2 = exercicio.nextDouble();
        
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Produto (multiplicação) entre os números digitados");
        System.out.println("3 - Divisão do primeiro pelo segundo");
        System.out.println("4 - Diferença do maior pelo menor");
        
        int opcao = exercicio.nextInt();
        //precesso
        
        
        switch(opcao) {
            case 1:
                double media = (numero1 + numero2) / 2;
                System.out.println("A média é: " + media);
                break;
            case 2:
                double produto = numero1 * numero2;
                System.out.println("O produto é: " + produto);
                break;
            case 3:
                if(numero2 == 0) {
                    System.out.println("Não é possível realizar a divisão por zero.");
                } else {
                    double divisao = numero1 / numero2;
                    System.out.println("A divisão do primeiro pelo segundo é: " + divisao);
                }
                break;
            case 4:
                double diferenca = Math.abs(numero1 - numero2);
                System.out.println("A diferença do maior pelo menor é: " + diferenca);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
        
        
        
        
        
    }
    
}
