
package Unidade4Exercicios3;


//Exercício 3 Letra i
public class TesteOperario {

    
    public static void main(String[] args) {
       
        Operario ope1 = new Operario ();
        
        
       ope1.setNome("Guilhermanaldo");
       ope1.setEndereco("Sitio Estrela, s/n");
       ope1.setTelefone("Não há");
       ope1.setCodigoSetor(990);
       ope1.setSalarioBase(1550.90);
       ope1.setImposto(5);
       ope1.setValorProducao(23000);
       ope1.setComicao(2);
       
       
       
        System.out.println(ope1.dizerOperarioDados());
        
        
    }
    
}
