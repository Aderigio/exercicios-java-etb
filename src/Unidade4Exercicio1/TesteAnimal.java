package Unidade4Exercicio1;

import java.util.Scanner;

public class TesteAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Peixe a1 = new Peixe();
        a1.setNome("Peixinho Dourado do C�o");
        a1.setPeso(300.4);
        a1.setTipoHabitat("Aqu�rio Gigante");

        System.out.println(" O nome do animal � " + a1.getNome() + ", seu peso � " + a1.getPeso() + "kg e seu habitat � " + a1.getTipoHabitat() + ".\n");

        // teste Cachorro
        Cachorro a2 = new Cachorro();
        a2.setNome("Tot�");
        a2.setPeso(500);
        a2.setRaca("Vira-Lata-Fura-Saco");

        System.out.println(" O nome do animal � " + a2.getNome() + ", seu peso � " + a2.getPeso() + "kg e sua ra�a � " + a2.getRaca() + ".\n\n\n\n");

    }

}
