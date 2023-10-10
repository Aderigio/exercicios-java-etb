
package Unidade4Exercicios3;

//Exercício 3 Letra h
public class TesteAdministrador {

    
    public static void main(String[] args) {
        
    Administrador adm1 = new Administrador ();

    adm1.setNome("Sorlorde");
    adm1.setEndereco("Avenida do Ouro, nº 79");
    adm1.setTelefone("(99)9990-0000");
    adm1.setCodigoSetor(123);
    adm1.setSalarioBase(123456.78);
    adm1.setImposto(10);
    adm1.setAjudaDeCusto(9101112.13);
    
    
        System.out.println(adm1.dizerAdmDados());
        
        
    }
    
}
