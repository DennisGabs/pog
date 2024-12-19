package zoologico.service;

import zoologico.entities.Animal;
import zoologico.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais = new ArrayList();
    private List<Funcionario> funcionarios = new ArrayList<>();
    int totalAnimais = 0;

    public void adicionarAnimal(Animal animal){
        this.animais.add(animal);
    }

    public void adicionarFunciorio(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void cuidarAnimais(){

    }

    // Poderia ser da classe Animal?
    public void alterarNomeAnimal(Animal animal, String novoNome){
        String temp = animal.getNome();
        animal.setNome(novoNome);
        System.out.println("Antigo nome do animal: " + temp + " agora é: " + animal.getNome());
    }
}
