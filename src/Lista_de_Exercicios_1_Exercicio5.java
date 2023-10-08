import java.util.Scanner;

public class Lista_de_Exercicios_1_Exercicio5 {
    public static void main(String[] args) {
        Scanner atividade = new Scanner(System.in);
        
     //Entrada
     
        System.out.println("Faça um programa que receba receba o salário de um funcionário e o percentual de aumento,\n" +
"mostre o valor do aumento e o novo salário.");
        System.out.println(" ");
        
        System.out.println(" Entre com o salario: ");
        double sala = atividade.nextDouble();
        
        System.out.println(" Entre com o percentual(%) de aumento: ");
        double aumentoPorcento = atividade.nextDouble();
        
        //Processo
      double salaAumento = (sala*aumentoPorcento)/100;
      double salaAumentado = (salaAumento + sala);
        
      //Saida 
      
        System.out.println(" O Salario mais o percentual de aumento será:" + salaAumentado);         
        
    }
    
    
    
}
