
package Unidade4Exercicios2;

public class TesteUni4Exer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //teste Pessoa
        
        System.out.println("Teste Pessoa \n");
        
        Pessoa pessoa1 = new Pessoa();
        
        pessoa1.setNome("Jão");
        pessoa1.setIdade(22);
        pessoa1.setSexo("M");
        
        
        System.out.println(pessoa1.toString());
        
        System.out.println("__________________________\n");
        //teste Cliente
        
        System.out.println("Teste Cliente \n");
        
        Cliente cliente1 = new Cliente ();
        
        cliente1.setAnoNascim(1999);
        cliente1.setValorDivida(2000);
        cliente1.setNome("Ornitolândio");
        cliente1.setSexo("M");
        cliente1.setIdade(24);
        
        System.out.println(cliente1.dizerNomeCliente());
        
         System.out.println("__________________________\n");
        //teste Empregada
        
        System.out.println(" Teste Empregada \n");
        
        
        Empregada empregada1 = new Empregada ();
        
        empregada1.setNome("Marianda");
        empregada1.setIdade(33);
        empregada1.setSexo("F");
        empregada1.setSalario(3300);
        empregada1.setMatricula("A339714");
        
        
        System.out.println (empregada1.dizerNomeEmpregada());
        
        
         System.out.println("__________________________\n");
        //Gerência 
        
        System.out.println("Teste Gerência");
        
        Gerente gerente1 = new Gerente();
        
        gerente1.setNome("Armecinda");
        gerente1.setIdade(19);
        gerente1.setSexo("F");
        gerente1.setMatricula("AA007");
        gerente1.setNomeGerencia(" Filha do Dono - Classe A1");
        gerente1.setSalario(90000);
        
        
        System.out.println(gerente1.dizerNomeGerencia());
        
        
         System.out.println("__________________________\n");
        // Teste Vendedor
        
        System.out.println("Teste Vendedor");
        
        Vendedor vendedor1  = new Vendedor();
        
        vendedor1.setNome("Ariosrindo");
        vendedor1.setIdade(79);
        vendedor1.setMatricula("S-001");
        vendedor1.setSalario(3794);
        vendedor1.setSexo("M");
        vendedor1.setQntVendas(2379);
        vendedor1.setValorDivida(5739355);
        
        
        System.out.println(vendedor1.dizerNomeVendedor());
        
        
                
                
       
        
       
        
        
    
    
    
    
    
    
    }
    
}
