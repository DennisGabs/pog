package zoologico.app;

import zoologico.entities.*;
import zoologico.service.Zoologico;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Zoologico zoo = new Zoologico();
        Reptil cobra = new Reptil("Jara", "Jararaca", 27.8f);
        zoo.adicionarAnimal(cobra);

        Mamifero cachorro = new Mamifero("Black", "Pudle");
        cachorro.setTempoGestacao(2);
        zoo.adicionarAnimal(cachorro);

        Ave papagaio = new Ave("Loro", "falante");
        papagaio.setTipoPenas("Verde");
        zoo.adicionarAnimal(papagaio);

        Funcionario dennis = new Funcionario("Dennis", Reptil.TIPO);
        Funcionario silva = new Funcionario("Silva", Ave.TIPO);
        Funcionario alves = new Funcionario("Alves", Mamifero.TIPO);

        zoo.adicionarFunciorio(dennis);
        zoo.adicionarFunciorio(silva);
        zoo.adicionarFunciorio(alves);

        zoo.cuidarAnimais();

        zoo.alterarNomeAnimal(papagaio, "Caqui");

        System.out.println("Total animais:s " + Animal.totalAnimais);

    }
}
