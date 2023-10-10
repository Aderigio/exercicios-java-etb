package Unidade4Exercicios3;


//Exercício 3 Letra a
public class Pessoa {
    
    
    private String nome;
    private String endereco;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
  
    
    public String dizerPessoa(){
    return "Nome: "+ getNome() +"\n"
            + "Endereço:" + getEndereco() + "\n" 
            + "Telefone: " + getTelefone() + "\n";
    }
    
}
