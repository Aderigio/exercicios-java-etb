
package Unidade4Exercicios2;


public class Gerente extends Empregada {
    
    private String nomeGerencia;

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    
    public String dizerGerencia (){
    return "O nome da gerência  é" + getNomeGerencia () + ".";
    }
    
    public String dizerNomeGerencia (){
    return super.dizerNomeEmpregada() + dizerGerencia();
    }

}



