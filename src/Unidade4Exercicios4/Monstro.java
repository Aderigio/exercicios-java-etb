package Unidade4Exercicios4;

public class Monstro extends Gigante {

    private String nomeAtaqueMonstro;
    private int poderAtaqueMonstro;

    public String getNomeAtaqueMonstro() {
        return nomeAtaqueMonstro;
    }

    public void setNomeAtaqueMonstro(String nomeAtaqueMonstro) {
        this.nomeAtaqueMonstro = nomeAtaqueMonstro;
    }

    public int getPoderAtaqueMonstro() {
        return poderAtaqueMonstro;
    }

    public void setPoderAtaqueMonstro(int poderAtaqueMonstro) {
        this.poderAtaqueMonstro = poderAtaqueMonstro;
    }

    public int calculoAtaqueMonstro() {
        int ataqueTotal = (getPoderAtaque() + getPoderAtaqueMonstro());
        return ataqueTotal;

    }

    public String dizerMonstro() {

        return "Nome do Ataque Monstro: " + getNomeAtaqueMonstro() + "\n"
                + " Poder do Ataque Monstro: " + getPoderAtaqueMonstro() + "\n"
                + "Total poder do Ataque Monstro: " + calculoAtaqueMonstro() + "\n";
    }

    public String dizerMonstroDados() {

        return super.dizerGigante() + dizerMonstro();

    }

}
