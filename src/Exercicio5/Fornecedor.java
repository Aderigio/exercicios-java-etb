package Exercicio5;

/**
 *
 * @author Aderígio Araújo Tomé Candido
 */
public class Fornecedor extends Pessoa{
    
    private double receita;
    private double despesa;

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

    public double getDespesa() {
        return despesa;
    }

    public void setDespesa(double despesa) {
        this.despesa = despesa;
    }
    
    
    
    public double obterSaldo(){
    
    double saldo = getReceita()- getDespesa();
    
    return saldo;
    
    }
  
  @Override
  public String toString (){
  
  return super.toString() +
          " Receita:" + getReceita() + "\n"
          + "Despesa: " + getDespesa() + "\n"
          + "Saldo: " + obterSaldo() + "\n";
  }  
}
