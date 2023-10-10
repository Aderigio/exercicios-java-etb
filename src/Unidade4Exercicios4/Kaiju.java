package Unidade4Exercicios4;

public class Kaiju extends Monstro {

    private int ataqueKaijumult;
    private int defesaKaijumult;
    private String nomeAtkKaiju;
    private String nomeDefKaiju;

    public int getAtaqueKaijumult() {
        return ataqueKaijumult;
    }

    public void setAtaqueKaijumult(int ataqueKaijumult) {
        this.ataqueKaijumult = ataqueKaijumult;
    }

    public int getDefesaKaijumult() {
        return defesaKaijumult;
    }

    public void setDefesaKaijumult(int defesaKaijumult) {
        this.defesaKaijumult = defesaKaijumult;
    }

    public String getNomeAtkKaiju() {
        return nomeAtkKaiju;
    }

    public void setNomeAtkKaiju(String nomeAtkKaiju) {
        this.nomeAtkKaiju = nomeAtkKaiju;
    }

    public String getNomeDefKaiju() {
        return nomeDefKaiju;
    }

    public void setNomeDefKaiju(String nomeDefKaiju) {
        this.nomeDefKaiju = nomeDefKaiju;
    }

    public int calcMultAtk() {
        int multAtk = (calculoAtaqueMonstro() * getAtaqueKaijumult());
        return multAtk;
    }

    public int calcMultDef() {
        int multDef = (getPoderDefesa() * getDefesaKaijumult());
        return multDef;
    }

    public String dizerKaiju() {

        return "Nome do poder Kaiju: " + getNomeAtkKaiju() + "\n"
                + "Multiplicador de Ataque do Poder Kaiju: " + getAtaqueKaijumult() + "\n"
                + "Nome da Defesa Kaiju: " + getNomeDefKaiju() + "\n"
                + "Multiplicador de Defesa do Poder Kaiju: " + getDefesaKaijumult() + "\n"
                + "Total Ataque Poder Kaiju: " + calcMultAtk() + "\n"
                + "Total Defesa Poder kaiju: " + calcMultDef() + "\n";

    }

    public String dizerKaijuDados() {

        return super.dizerMonstroDados() + dizerKaiju();
    }

}
