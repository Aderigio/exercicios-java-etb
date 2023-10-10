
package Exercicio2;

/**
 *
 * @author Aderígio Araújo Tomé CAndido
 */
public class RoboGiganteDeResgate extends RoboGigante{
    
    private int capacidadeResgate;

    public int getCapacidadeResgate() {
        return capacidadeResgate;
    }

    public void setCapacidadeResgate(int capacidadeResgate) {
        this.capacidadeResgate = capacidadeResgate;
    }
     
    
    @Override
    public double calculoPoderDefesa (){
    
    double defesaTotal = ( getMultpliAtaque()* getPoderDefesa()+ getCapacidadeResgate());
    
    return defesaTotal;
    
    }

    
}
