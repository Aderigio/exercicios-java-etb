
package Unidade4Exercicios3;


//Exercício 3 Letra f
public class TesteEmpregado {

    
    public static void main(String[] args) {
        
        Empregado empre1 = new Empregado ();
        
        empre1.setNome("Esquinovando");
        empre1.setEndereco("Rua dos Bobos, nº 0");
        empre1.setTelefone("(99) 99998-9990");
        empre1.setCodigoSetor(18);
        empre1.setSalarioBase(3599.90);
        empre1.setImposto(2);
        
        
        System.out.println(empre1.dizerEmpregadoDados());
        
    }
    
}
