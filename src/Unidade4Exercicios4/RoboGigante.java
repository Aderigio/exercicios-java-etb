package Unidade4Exercicios4;

public class RoboGigante extends Gigante {

    private String nomeAtaqueRobo;
    private int poderAtaqueRobo;

    public String getNomeAtaqueRobo() {
        return nomeAtaqueRobo;
    }

    public void setNomeAtaqueRobo(String nomeAtaqueRobo) {
        this.nomeAtaqueRobo = nomeAtaqueRobo;
    }

    public int getPoderAtaqueRobo() {
        return poderAtaqueRobo;
    }

    public void setPoderAtaqueRobo(int poderAtaqueRobo) {
        this.poderAtaqueRobo = poderAtaqueRobo;
    }

    public int calculoAtaqueRobo() {
        int ataqueTotal = (getPoderAtaque() + getPoderAtaqueRobo());
        return ataqueTotal;
    }

    public String dizerRobo() {

        return "Nome do Ataque Robo Gigante: " + getNomeAtaqueRobo() + "\n"
                + " Poder do Ataque Robo Gigante: " + getPoderAtaqueRobo() + "\n"
                + "Total poder do Ataque Gigante: " + calculoAtaqueRobo() + "\n";
    }

    public String dizerRoboDados() {
        return super.dizerGigante() + dizerRobo();
    }

}
