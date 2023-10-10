
package Exercicio4;

/**
 *
 * @author Aderígio Araújo Tomé Candido
 */
public class arredondamentoNumero {
    
private double valor1 = Math.round(5.2);
private double valor2 = Math.round(5.6);
private double valor3 = Math.round(-5.6);

    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public double getValor3() {
        return valor3;
    }

    @Override
    public String toString() {
        return "arredondamentoNumero{" + "valor1=" + valor1 + ", valor2=" + valor2 + ", valor3=" + valor3 + '}';
    }
 




}
