
package Unidade4Exercicios3;


//Exerc�cio 3 Letra e
public class Empregado extends Pessoa{
    
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
 public double calcularSalario() {
        double salarioLiquido = salarioBase - (salarioBase * (imposto/100));
        return salarioLiquido;   
 }

 //Exerc�cio 3 Letra f

public String dizerEmpregado (){

    return "C�digo do Setor: " + getCodigoSetor() + "\n"
            +" Sal�rio Base: " + getSalarioBase() + "\n "
            +" Imposto retido: " + getImposto() + "\n"
            + "Sal�rio final: " + calcularSalario() + "\n";


}

public String dizerEmpregadoDados (){

return dizerPessoa() + dizerEmpregado();
}

 
}
