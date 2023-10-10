
package Exercicio2;

/**
 *
 * @author Aderígio Araújo Tomé Candido
 */
public class RoboGiganteDeCombate extends RoboGigante{
    
    
    private int forca;

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
    
    @Override
    public double calculoPoderAtaque (){
    
    double ataqueTotal = ( getMultpliAtaque()* getPoderAtaque() * getForca());
    
    return ataqueTotal;
    } 

    @Override
    public double calculoPoderDefesa (){
    
    double defesaTotal = ( getMultpliAtaque()* getPoderDefesa() * getForca());
    
    return defesaTotal;
    } 
    

    
}
