package zoologico.entities;

public class Funcionario {
    public static int totalFuncionarios = 0;
    private int id;
    private String nome;
    private String especialidade;

    public Funcionario(){
        totalFuncionarios += 1;
        id = totalFuncionarios;
    }

    public Funcionario(String nome, String especialidade){
        totalFuncionarios += 1;
        this.id = totalFuncionarios;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void cuidarAnimal(Animal animal){
        System.out.println(this.nome + " está cuidando do animal " + animal.getNome());
    }
}
