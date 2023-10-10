package Unidade4Exercicios4;

public class TesteKaiju {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Kaiju kaiju1 = new Kaiju();

        kaiju1.setNome("Godzilla");
        kaiju1.setCategoria("S");
        kaiju1.setPoderAtaque(5939);
        kaiju1.setPoderDefesa(5999);
        kaiju1.setNomeAtaqueMonstro("Pulso Nuclear");
        kaiju1.setPoderAtaqueMonstro(5000);
        kaiju1.setNomeAtkKaiju("Pulso Nuclear");
        kaiju1.setAtaqueKaijumult(10);
        kaiju1.setNomeDefKaiju("Regeneração");
        kaiju1.setDefesaKaijumult(12);

        System.out.println(kaiju1.dizerKaijuDados());

    }

}
