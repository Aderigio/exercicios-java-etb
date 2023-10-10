package Unidade4Exercicios4;

public class RoboGiganteFuturo extends RoboGigante {

    private String nomePiloto;
    private int ataqueRoboMult;
    private int defesaRoboMult;
    private String nomeAtkRoboMult;
    private String nomeDefRoboMult;

    public String getNomePiloto() {
        return nomePiloto;
    }

    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }

    public int getAtaqueRoboMult() {
        return ataqueRoboMult;
    }

    public void setAtaqueRoboMult(int ataqueRoboMult) {
        this.ataqueRoboMult = ataqueRoboMult;
    }

    public int getDefesaRoboMult() {
        return defesaRoboMult;
    }

    public void setDefesaRoboMult(int defesaRoboMult) {
        this.defesaRoboMult = defesaRoboMult;
    }

    public String getNomeAtkRoboMult() {
        return nomeAtkRoboMult;
    }

    public void setNomeAtkRoboMult(String nomeAtkRoboMult) {
        this.nomeAtkRoboMult = nomeAtkRoboMult;
    }

    public String getNomeDefRoboMult() {
        return nomeDefRoboMult;
    }

    public void setNomeDefRoboMult(String nomeDefRoboMult) {
        this.nomeDefRoboMult = nomeDefRoboMult;
    }

    public int calcMultAtkRobo() {
        int multAtk = (calculoAtaqueRobo() * getAtaqueRoboMult());
        return multAtk;
    }

    public int calcMultDefRobo() {
        int multDef = (getPoderDefesa() * getDefesaRoboMult());
        return multDef;
    }

    public String dizerRoboGiganteFuturo() {

        return "Nome do poder Robo do Futuro: " + getNomeAtaqueRobo() + "\n"
                + "Nome do Piloto " + getNomePiloto() + "\n"
                + "Multiplicador de Ataque do Robo do Futuro: " + getAtaqueRoboMult() + "\n"
                + "Nome da Defesa Robo do Futuro: " + getNomeDefRoboMult() + "\n"
                + "Multiplicador de Defesa do Poder Robo do Futuro: " + getDefesaRoboMult() + "\n"
                + "Total Ataque Poder Robo do Futuro: " + calcMultAtkRobo() + "\n"
                + "Total Defesa Poder Robo do Futuro: " + calcMultDefRobo() + "\n";

    }

    public String dizerRoboGiganteFuturoDados() {

        return super.dizerRoboDados() + dizerRoboGiganteFuturo();
    }

}
