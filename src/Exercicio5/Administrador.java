package Exercicio5;

/**
 *
 * @author Aderígio Araújo Tomé Candido
 */
public class Administrador extends Empregado {
    
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    @Override
    public double calcularSalario (){
    double salarioTotal = super.calcularSalario() + getAjudaDeCusto();
    return salarioTotal;
    }
  
    
    public String toString (){
    return super.toString() + "\n"
            + "Ajuda de Custo: " + getAjudaDeCusto() + "\n";
    
    
    
    
    }
    
}
