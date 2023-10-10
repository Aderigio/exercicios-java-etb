package Exercicio5;

/**
 *
 * @author Aderígio Araújo Tomé Candido
 */
public class Cliente extends Pessoa{
    
    private String email;
    private String telefone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return  super.toString() 
                + "Email: " + email + "\n"
                + "Telefone: " + telefone + "\n";
    }
    
    
    
    
}
