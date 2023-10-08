import java.util.Scanner;
public class Lista_de_Exercicios_1_Exercicio6 {
    public static void main(String[] args) {
        Scanner atividade = new Scanner (System.in);
        
        //Entrada
        System.out.println("Receba o salário base de um funcionário, calcule e mostre o salário a receber, sabendo-se\n" +
"que o funcionário tem 5% de gratificação sobre o salário base e paga imposto de 7% sobre este\n" +
"salário");
        double salario = atividade.nextDouble();
        
        //processo
        
        double gratifica = salario*0.05;
        double salarioGrati = (salario + gratifica);
        double imposto = salarioGrati*0.07;
        double salarioFinal = (salarioGrati - imposto);
                //0.5/0.7;
        
        //saída
        
        System.out.println("O Salario final, acrescentado a gratificação e o imposto é:" + salarioFinal);
        
        
        
        
        
        
    }
    
}
