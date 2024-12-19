package zoologico.app;

import zoologico.entities.Animal;
import zoologico.entities.Funcionario;
import zoologico.entities.Reptil;
import zoologico.service.Zoologico;

public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        Reptil cobra = new Reptil();
        cobra.setNome("Jara");
        cobra.setEspecie("Jararaca");
        cobra.setTemperaturaCorporal(27.8f);
        zoo.adicionarAnimal(cobra);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Dennis");
        funcionario.setEspecialidade("Repteis");
    }
}
