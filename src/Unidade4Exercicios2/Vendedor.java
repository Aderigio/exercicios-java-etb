
package Unidade4Exercicios2;

public class Vendedor extends Empregada{
    
    private double valorDivida;
    private int qntVendas;

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }
    
    
    
    public String dizerVendedor(){
    
    return "O valor da dívida  é" + getValorDivida()+ ".\n"
            + "A quantidade de vendas é: " + getQntVendas() + ".";
    
    }
    public String dizerNomeVendedor(){
    
    return super.dizerNomeEmpregada() + dizerVendedor();
    }
    
    
    }
    
    

