
package Unidade4Exercicios3;


//Exercício 3 Letra h
public class Administrador extends Empregado {
    
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    
    public double calcularSalarioAdm() {
        double salarioLiquido = ((getSalarioBase() - (getSalarioBase() * (getImposto()/100)))+ getAjudaDeCusto());
        return salarioLiquido; 
}
    
public String dizerAdm (){

return "Ajuda de custo: " + getAjudaDeCusto() + ".\n";

}

public String dizerAdmDados (){

return dizerEmpregadoDados() + dizerAdm();
}

}
