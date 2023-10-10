package Exercicio5;

/**
 *
 * @author Aderígio Araújo TOmé Candido
 */
public class Empregado extends Pessoa{
    
    private int matricula;
    private double salario;
    private String setor;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    
    public double calcularSalario (){
    double salarioTotal = (getSalario() - getSalario() * 0.11);
    return salarioTotal;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "Matricula: " + getMatricula() + "\n"
                + "Salário: " + getSalario() + "\n"
                + "Setor= " + getSetor() +  "\n"
                + "Salário Total: " + calcularSalario() + "\n";
    }
    
    
    
    
}
