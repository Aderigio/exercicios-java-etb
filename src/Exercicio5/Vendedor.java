package Exercicio5;

/**
 *
 * @author Aderígio Araújo Tomé Candido
 */
public class Vendedor extends Empregado{
    
    private double comissao;
    private double valorVendas;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    
  @Override
    public double calcularSalario() {
        double salarioTotal = (super.calcularSalario() + getComissao() * getValorVendas());
        return salarioTotal;  
    }
    
  @Override
    public String toString(){
    
    return super.toString() + "\n"
           + "Comissão: " + getComissao() + "\n"
            + "Valor da Produção: " + getValorVendas()+ "\n";
    
    }
      
        
 
    
}
