
package Unidade4Exercicios3;


//Exerc�cio 3 Letra b
public class Fornecedor extends Pessoa{
    
    private double valorDivida;
    private double valorCredito; 

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
    
    //Letra c
    
    public double obterSaldo (){
    return (getValorCredito())-(getValorDivida());
    }
    
    
    
    public String dizerFornecedor(){
    return " Valor da D�vida: " + getValorDivida() + "\n" 
            + "Valor do Cr�dito " + getValorCredito() + ".\n"
            + " O saldo � " + obterSaldo ();
    }
    
    public String dizerNomeFornecedor(){
    return super.dizerPessoa() + dizerFornecedor();
    }
    
   
    
    
}
