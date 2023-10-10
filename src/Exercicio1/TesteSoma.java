package Exercicio1;
/**
 *
 * @author Aderígio Araújo Tomé Candido
 */
public class TesteSoma {
    
    public static void main(String[] args) {
        
        Soma soma = new Soma(); // cria instância da classe Soma
 // Declara várias variáveis
 byte b = 20;
 short s = 99;
 int i = 1000;
 long l = 1234L;
 float f = 3.1416f;
 double d = 2000;
 // Chama vários métodos da classe Soma
 System.out.println(soma.doisValores(b,s)); //Escreva aqui qual método foi chamado
 System.out.println(soma.doisValores(i,s)); //Escreva aqui qual método foi chamado
 System.out.println(soma.doisValores(i,i)); //Escreva aqui qual método foi chamado
 System.out.println(soma.doisValores(l,b)); //Escreva aqui qual método foi chamado
 System.out.println(soma.doisValores(f,s)); //Escreva aqui qual método foi chamado
 System.out.println(soma.doisValores(d,b)); //Escreva aqui qual método foi chamado
 System.out.println(soma.doisValores(b,d)); //Escreva aqui qual método foi chamado
 System.out.println(soma.doisValores(i,l)); //Escreva aqui qual método foi chamado
 System.out.println(soma.doisValores(l,l)); //Escreva aqui qual método foi chamado
 System.out.println(soma.doisValores(d,f)); //Escreva aqui qual método foi chamado
 
        System.out.println("\n\n\n______________________________\n\n\n");
        System.out.println("Respostas: \n");
        
        
System.out.println(soma.doisValores(b,s) + "Método: int doisValores(int a, int b)");
System.out.println(soma.doisValores(i,s)+ "Método: int doisValores(int a, int b)");
System.out.println(soma.doisValores(i,i) + "Método: int doisValores(int a, int b)");
System.out.println(soma.doisValores(l,b) + "Método: double doisValores(double a, int b)");
System.out.println(soma.doisValores(f,s) + "Método: double doisValores(double a, int b)");
System.out.println(soma.doisValores(d,b) + "Método: double doisValores(double a, int b)");
System.out.println(soma.doisValores(b,d) + "Método: double doisValores(double a, int b)");
System.out.println(soma.doisValores(i,l) + "Método: double doisValores(double a, int b)");
System.out.println(soma.doisValores(l,l) + "Método: double doisValores(double a, double b)");
System.out.println(soma.doisValores(d,f) + "Método: double doisValores(double a, double b)");

        
        
    }
    
}
