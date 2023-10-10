package Exercicio5;

/**
 *
 * @author Aderígio Araújo Tomé Candido
 */
public class Pessoa {
    
    private String nome;
    private long contribuinte;
    private byte idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(long contribuinte) {
        this.contribuinte = contribuinte;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString (){
    
    return "Nome: " + getNome() + "\n"
            + "Contribuinte: " + getContribuinte() + "\n"
            + "Idade: " + getIdade() + "\n";
    }
    
}
