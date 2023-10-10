
package ExemplosDoVideo;

/**
 *
 * @author Aderígio Araújo Tomé Candido
 */
public class MetodoEstatico {
    
    //Metodo não estático
    
    
    private double saldo; 
    
    //Método Estático 
    
    
    public static int resultados (int num1, int num2){
    
        return (num1 + num2);
    
    }
    
    
 //encapsulamento
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
