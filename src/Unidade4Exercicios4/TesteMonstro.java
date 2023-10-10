package Unidade4Exercicios4;

public class TesteMonstro extends Gigante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Monstro mons1 = new Monstro();

        mons1.setNome("Homem Marshmallow");
        mons1.setCategoria("C");
        mons1.setPoderAtaque(120);
        mons1.setPoderDefesa(100);
        mons1.setNomeAtaqueMonstro("Pneu Maluco");
        mons1.setPoderAtaqueMonstro(50);

        System.out.println(mons1.dizerMonstroDados());

    }

}
