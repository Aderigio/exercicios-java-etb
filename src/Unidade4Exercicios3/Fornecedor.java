
package Unidade4Exercicios3;


//Exercício 3 Letra b
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
    return " Valor da Dívida: " + getValorDivida() + "\n" 
            + "Valor do Crédito " + getValorCredito() + ".\n"
            + " O saldo é " + obterSaldo ();
    }
    
    public String dizerNomeFornecedor(){
    return super.dizerPessoa() + dizerFornecedor();
    }
    
   
    
    
}
