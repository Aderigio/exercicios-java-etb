package Exercicio3;

/**
 *
 * @author Aderígio Araújo Tomé Candido
 */
public class segundoMetodoEstatico {
    
    
  public static double notafinal(double nota1, double nota2, double nota3, double pesoNota1, double pesoNota2, double pesoNota3){
		return ((nota1*pesoNota1) + (nota2*pesoNota2) + (nota3*pesoNota3))/(pesoNota1 + pesoNota2 + pesoNota3);
	}
   
  

  
}
