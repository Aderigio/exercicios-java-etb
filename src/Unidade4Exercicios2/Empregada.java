package Unidade4Exercicios2;

public class Empregada extends Pessoa{
    
    private double salario;
    private String matricula;
    
    
   public double getSalario (){
   return salario;
   }
   
    public void setSalario (int salario){
    this.salario = salario;
   }
    
   
    public String getMatricula () {
    return matricula;
    }
    
    public void setMatricula (String matricula) {
    this.matricula = matricula;
    }
    
    public double valorInss() {
        // Realiza o cálculo do INSS (11% do salário)
        return getSalario() * 0.11;
    }
    
    
    
    
    
    
    
    
    public String toStringEmpregada (){
    
        return "A Matrícula da Empregada é " + getMatricula() + "\n"
                + "O salário é " + getSalario () + "\n" 
                + " O valor de desconto do INSS é " +  valorInss () + ".\n";
    
    }
    
    public String dizerNomeEmpregada (){
    
    return super.toString() + toStringEmpregada();
    }
   
    
}
