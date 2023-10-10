
package Unidade4Exercicios3;


//Exercício 3 Letra j
public class Vendedor extends Empregado{
    
    private double valorVendas;
    private double comicao;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComicaoVend() {
        return comicao;
    }

    public void setComicao(double comicao) {
        this.comicao = comicao;
    }
    
   
    public double calcularSalario() {
        double salarioLiquidoImposto = ((getSalarioBase() - (getSalarioBase() * (getImposto()/100))));
        double salarioLiquido = ((getValorVendas()* (getComicaoVend()/100)) + salarioLiquidoImposto);
        
        return salarioLiquido; 
    }
    
    public String dizerVendedor (){
        
     return "Valor das Vendas:" + getValorVendas()+ "\n"
             + "Valor da comissão: " + getComicaoVend()+ "\n";  
    }
    
    
    public String dizerVendedorDados () {
    
    return super.dizerEmpregadoDados() + dizerVendedor();
    
    }
}
