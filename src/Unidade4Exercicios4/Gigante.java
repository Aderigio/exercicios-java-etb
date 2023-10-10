package Unidade4Exercicios4;

public class Gigante {

    private String nome;
    private String categoria;
    private int poderAtaque;
    private int poderDefesa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public int getPoderDefesa() {
        return poderDefesa;
    }

    public void setPoderDefesa(int poderDefesa) {
        this.poderDefesa = poderDefesa;
    }

    public String dizerGigante() {

        return "Nome: " + getNome() + "\n"
                + "Categoria: " + getCategoria() + "\n"
                + "Poder de Ataque: " + getPoderAtaque() + "\n"
                + " Poder de Defesa: " + getPoderDefesa() + "\n";
    }

}
