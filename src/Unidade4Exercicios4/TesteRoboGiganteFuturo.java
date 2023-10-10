package Unidade4Exercicios4;

public class TesteRoboGiganteFuturo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RoboGiganteFuturo xlr = new RoboGiganteFuturo();

        xlr.setAtaqueRoboMult(2000);
        xlr.setCategoria("+ S");
        xlr.setDefesaRoboMult(2000);
        xlr.setNome("XLR");
        xlr.setNomeAtaqueRobo("O piloto inventa na hora");
        xlr.setNomeAtkRoboMult("Qualquer coisa seguida de algo extravagante");
        xlr.setNomeDefRoboMult("Normalmente se defende na cagada.");
        xlr.setNomePiloto("Cara");
        xlr.setPoderAtaque(9999);
        xlr.setPoderAtaqueRobo(5999);
        xlr.setPoderDefesa(9999);

        System.out.println(xlr.dizerRoboGiganteFuturoDados());

    }

}
