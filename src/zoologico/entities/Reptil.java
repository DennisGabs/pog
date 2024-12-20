package zoologico.entities;

public class Reptil extends Animal {
    public static final String TIPO = "Reptil";
    private float temperaturaCorporal;

    public Reptil(String nome, String especie, float temperaturaCorporal) {
        super(nome, especie);
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public void setTemperaturaCorporal(float temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public float getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    @Override
    protected void emitirSom() {
        System.out.println(getNome() + " é um reptil");
    }

    @Override
    public String getTipo() {
        return TIPO;
    }
}
