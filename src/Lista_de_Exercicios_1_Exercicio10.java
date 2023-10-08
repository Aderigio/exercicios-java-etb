import java.util.Scanner;
public class Lista_de_Exercicios_1_Exercicio10 {
    public static void main(String[] args) {
        Scanner atividade = new Scanner (System.in);
        
        //Entrada
        System.out.println("O valor de um carro novo é igual a soma do preço de fábrica com o percentual de lucro do\n" +
"distribuidor o percentual dos impostos aplicados ao preço de fábrica. Entre com o preço de fábrica\n" +
"o percentual de lucro dos distribuidores e o percentual dos impostos, ao final mostre, o valor do\n" +
"lucro do distribuidor o valor correspondente aos impostos e o preço de venda do veículo.");
            System.out.println("");
            System.out.println("Entre com o valor carro de fábrica: ");
            double precoFabrica = atividade.nextDouble();
            System.out.println(" Entre com o percentual dos impostos: ");
            double imposto = atividade.nextDouble();
            System.out.println("Entre com o percentual do lucro: ");
            double lucro = atividade.nextDouble();
        
            //processo
            
            double impostoPercentual = (imposto/100)*precoFabrica;
            double lucroPercentual = (lucro/100)* precoFabrica;
            double precoFinal = (precoFabrica + lucroPercentual + impostoPercentual);
                    
                    //Saída
                    
                   
            System.out.println(" O preço final será de:" + precoFinal);
            
         
            
          
    
    }
    
}

