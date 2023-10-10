package Exercicio5;

/**
 *
 * @author Aderígio Araújo Tomé Candido
 */

//Exerc�cio 3 Letra i
public class Operario extends Empregado{
    
    private double valorProducao;
    private double comissao;

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComicao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
    public double calcularSalario() {
        double salarioTotal = (super.calcularSalario() + getComissao() * getValorProducao());
        return salarioTotal; 
    }
    
    @Override
    public String toString(){
    
    return super.toString() + "\n"
           + "Comissão: " + getComissao() + "\n"
            + "Valor da Produção: " + getValorProducao()+ "\n";
    
    }
            
    
    
    
}
