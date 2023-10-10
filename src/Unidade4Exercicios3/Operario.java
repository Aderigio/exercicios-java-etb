
package Unidade4Exercicios3;



//Exercício 3 Letra i
public class Operario extends Empregado{
    
    private double valorProducao;
    private double comicao;

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComicao() {
        return comicao;
    }

    public void setComicao(double comicao) {
        this.comicao = comicao;
    }
    
    @Override
    public double calcularSalario() {
        double salarioLiquidoImposto = ((getSalarioBase() - (getSalarioBase() * (getImposto()/100))));
        double salarioLiquido = ((getValorProducao()* (getComicao()/100)) + salarioLiquidoImposto);
        
        return salarioLiquido; 
    }
    
    public String dizerOperario(){
    
    return "Comição: " + getComicao() + "\n"
            + "Valor da Produção: " + getValorProducao();
    
    }
    
    public String dizerOperarioDados () {
    
    return dizerEmpregadoDados() + dizerOperario();
    }
            
    
    
    
}
