
package Exercicio2;

/**
 *
 * @author Aderígio Araújo Tomé CAndido
 */
public class RoboGigante {
    
    private String nome;
    private int altura;
    private double poderAtaque;
    private double multpliAtaque;
    private double poderDefesa;
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    

    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public double getMultpliAtaque() {
        return multpliAtaque;
    }

    public void setMultpliAtaque(double multpliAtaque) {
        this.multpliAtaque = multpliAtaque;
    }

    public double getPoderDefesa() {
        return poderDefesa;
    }

    public void setPoderDefesa(double poderDefesa) {
        this.poderDefesa = poderDefesa;
    }
    
    
    public double calculoPoderAtaque (){
    
    double ataqueTotal = ( getMultpliAtaque()* getPoderAtaque());
    
    return ataqueTotal;
    } 

    public double calculoPoderDefesa (){
    
    double defesaTotal = ( getMultpliAtaque()* getPoderDefesa());
    
    return defesaTotal;
    } 

    
}
