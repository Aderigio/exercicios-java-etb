package Unidade4Exercicios4;

public class TesteGigante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Gigante gig1 = new Gigante();

        gig1.setNome("Gigante do Pé de Feijão");
        gig1.setCategoria("D");
        gig1.setPoderAtaque(59);
        gig1.setPoderDefesa(32);

        System.out.println(gig1.dizerGigante());

    }

}
