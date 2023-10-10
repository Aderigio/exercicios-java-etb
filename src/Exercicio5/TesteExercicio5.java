package Exercicio5;
/**
 *
 * @author Aderígio Araújo Tomé Candido
 */
public class TesteExercicio5 {
    public static void main(String[] args) {
        
        //Teste Pessoa
        System.out.println("Pessoa\n");
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Hortelino");
        p1.setIdade((byte) 85);
        p1.setContribuinte(11234);
        
        
        System.out.println(p1.toString() + "\n");
             
     
     //teste FOnecedor
     System.out.println("Fornecedor\n");
     
     Fornecedor for1 = new Fornecedor();
     
     for1.setNome("Acme");
     for1.setIdade((byte) 120);
     for1.setContribuinte(33666);
     for1.setReceita(37795988);
     for1.setDespesa(71715);
     
     
        System.out.println(for1.toString() + "\n");
    
        
    // Cliente
    System.out.println("Cliente\n");
    
    Cliente cli1 = new Cliente ();
    
    
    cli1.setNome("Wile E. Coyote");
    cli1.setIdade((byte) 74);
    cli1.setContribuinte(1);
    cli1.setEmail("wileecoyote@acme.com");
    cli1.setTelefone("(555) 99-11");
    
    
        System.out.println(cli1.toString()+ "\n\n");
        
 
        
  // Empregado
    System.out.println("EMpregado\n");    
    
    Empregado emp1 = new Empregado ();
    
    emp1.setNome("Gaguinho");
    emp1.setIdade((byte) 88);
    emp1.setContribuinte(2223311);
    emp1.setMatricula(2455);
    emp1.setSetor("WB-LT01");
    emp1.setSalario(1555.90);
    
    
        System.out.println(emp1.toString() + "\n");
        
        
        //Administrador
        
        System.out.println("Administrador\n");
        
        Administrador adm1 = new Administrador ();
        
        adm1.setNome("Pernalonga");
        adm1.setIdade((byte) 85);
        adm1.setContribuinte(12);
        adm1.setMatricula(11111);
        adm1.setSetor("WB-LT-00");
        adm1.setSalario(333399.09);
        adm1.setAjudaDeCusto(123456789);
        
        System.out.println(adm1.toString());
        
        
        //Operário
        
         System.out.println("Operário\n");
        
        Operario Ope1 = new Operario();
        
        Ope1.setNome("Sam");
        Ope1.setContribuinte(789);
        Ope1.setIdade((byte)6);
        Ope1.setMatricula(77);
        Ope1.setSetor("WB-LT-Pasto");
        Ope1.setSalario(15);
        Ope1.setComicao(5);
        Ope1.setValorProducao(150);
        
        
        System.out.println(Ope1.toString() + "\n");
        
        
        //Vendedor
        
        System.out.println("Vendedor\n");
        
        Vendedor ven1 = new Vendedor ();
        
        ven1.setComissao(0.5);
        ven1.setContribuinte(00001);
        ven1.setIdade((byte)68);
        ven1.setMatricula(98);
        ven1.setNome("Taz");
        ven1.setSalario(3333.33);
        ven1.setSetor("WB-LT-Blublaurrrblublubla");
        ven1.setValorVendas(9999);
        
        
        System.out.println(ven1.toString() + "\n");
       
    
        
     
     
        
    }
    
}
