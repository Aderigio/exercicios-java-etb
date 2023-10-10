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
        // Realiza o c�lculo do INSS (11% do sal�rio)
        return getSalario() * 0.11;
    }
    
    
    
    
    
    
    
    
    public String toStringEmpregada (){
    
        return "A Matr�cula da Empregada � " + getMatricula() + "\n"
                + "O sal�rio � " + getSalario () + "\n" 
                + " O valor de desconto do INSS � " +  valorInss () + ".\n";
    
    }
    
    public String dizerNomeEmpregada (){
    
    return super.toString() + toStringEmpregada();
    }
   
    
}
