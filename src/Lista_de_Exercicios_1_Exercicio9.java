import java.util.Scanner;
public class Lista_de_Exercicios_1_Exercicio9 {
    public static void main(String[] args) {
        Scanner atividade = new Scanner (System.in);
        
        //Entrada
        
        System.out.println("Faça um programa que receba o ano de nascimento e ano atual, calcule e mostre a idade\n" +
"atual e a idade em 2080"); 
        System.out.println("");
        System.out.println(" Entre com sua data de nascimento: ");
        double dataNascimento = atividade.nextDouble();
        System.out.println("");
        
        System.out.println("Entre com o ano atual:");
        double dataAtual = atividade.nextDouble();
        
        //processamento
        
        double idadeAtual = dataAtual - dataNascimento;
        double idade2080 = 2080 - dataNascimento;
        
        // saída
        
        System.out.println(" A idade atual será de" + idadeAtual +".");
        System.out.println("A idade em 2080 será de" + idade2080 +".");
        
        
        System.out.println(" A idade atual será de" + idadeAtual +" a idade em 2080 será de" + idade2080 +".");
        
        
        
        
        
        
    }
    
}
