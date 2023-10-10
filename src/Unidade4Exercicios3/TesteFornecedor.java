
package Unidade4Exercicios3;


////Exercício 3 Letra d
public class TesteFornecedor {
    
    public static void main(String[] args) {
        
        Fornecedor fornecedor1 = new Fornecedor();
        
        
        fornecedor1.setNome("Crisantemo Conpany Litoranea");
        fornecedor1.setEndereco("Rua das Algas, nº 349, Rio Santo-RJ, CEP: 99999-999");
        fornecedor1.setTelefone("(99) 99999-9999");
        fornecedor1.setValorCredito(23898.45);
        fornecedor1.setValorDivida(12222.22);
        
        
        System.out.println(fornecedor1.dizerNomeFornecedor());
        
        
        
        
        
    }
    
}
