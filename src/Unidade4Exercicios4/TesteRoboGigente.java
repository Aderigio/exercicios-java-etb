package Unidade4Exercicios4;

public class TesteRoboGigente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RoboGigante robog1 = new RoboGigante();

        robog1.setNome("Daileon");
        robog1.setPoderAtaque(200);
        robog1.setPoderDefesa(190);
        robog1.setNomeAtaqueRobo("Raio Cósmico");
        robog1.setPoderAtaqueRobo(300);
        robog1.setCategoria("A");

        System.out.println(robog1.dizerRoboDados());

    }

}
