package Exemplo;

public class Teste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("JoJo");
        p1.setEndereco("Rua sem fim ");

        System.out.println(p1);

        // herdado
        System.out.println("-----------------\n");

        Professor p2 = new Professor();
        p2.setNome("Miguilin");
        p2.setEndereco("Rua da Matéria");
        p2.setMatricula(02211);
        p2.setSalario(5000.00);

        System.out.println(p2.getNome());
        System.out.println(p2.getEndereco());

        System.out.println(p2);

    }

}
