package zoologico.entities;

public class Reptil extends Animal{

    private float temperaturaCorporal;

    public Reptil(){
        totalAnimais += 1;
    }

    public void setTemperaturaCorporal(float temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public float getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    @Override
    protected void emitirSom() {
        System.out.println("Sou um reptil");
    }
}
