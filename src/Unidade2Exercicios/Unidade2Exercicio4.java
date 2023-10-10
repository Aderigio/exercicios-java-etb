
package Unidade2Exercicios;

import java.util.Scanner;

public class Unidade2Exercicio4 {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner ( System.in);
        
        
        
        System.out.println(" Uma empresa concederá um aumento variável de salário aos seus funcionários, "
                + "de acordo com o cargo, conforme a tabela abaixo. Faça um programa que leia o salário e o "
                + "código do cargo de um funcionário e calcule o novo salário. Se o cargo do funcionário não "
                + "estiver na tabela, ele deverá, então, receber 40% de aumento. Mostre o salário antigo, o novo "
                + "salário e a diferença. (faça usando as condicionais – switch e composta, isto é você fará dois "
                + "programas separadamente)");
        
        System.out.println("Código Cargo Percentual\n" +
                            "101 Gerente 10% \n" +
                            "102 Engenheiro 20% \n" +
                            "103 Técnico 30%");
        
        //Entrada
        double novoSalario;
        System.out.println("Entre com o salário atual: ");
        double salarioAntigo = exercicio.nextDouble();
        
        System.out.println("Entre com o código do cargo: ");
        int codigoCargo = exercicio.nextInt();
        
        if (codigoCargo == 101){
           novoSalario = salarioAntigo*1.1;
        } else if (codigoCargo == 102) {
            novoSalario = salarioAntigo*1.2;
        } else if (codigoCargo == 103) {
            novoSalario = salarioAntigo*1.30;
        } else  {
            novoSalario = salarioAntigo*1.40;
    }
        
        
            
        }
        
        
        
        
    }
    
