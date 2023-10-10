package Unidade4Exercicios2;

public class Cliente extends Pessoa {

    private double valorDivida;
    private int anoNascim;
    
    
    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }
    
   
    
   
   public String dizerCliente (){
   
   return "O valor da dívida é " + getValorDivida() + " e o ano de nascimento é " + getAnoNascim () + ".";
   }
   
   public String dizerNomeCliente (){
   
   return super.toString() + this.dizerCliente();
   }
    
    
    
}
