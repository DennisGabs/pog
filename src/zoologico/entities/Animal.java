package zoologico.entities;

public abstract class Animal {
    public static final String TIPO = "Animal";
    private int id;
    private String nome;
    private String especie;
    static int totalAnimais;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
        totalAnimais++;
        this.id = totalAnimais;
    }

    protected abstract void emitirSom();

    abstract public String getTipo();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
