package zoologico.entities;

public class Mamifero extends Animal{
    private int tempoGestacao;


    public Mamifero(){
        totalAnimais += 1;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    @Override
    protected void emitirSom() {
        System.out.println("Sou mamifero");
    }
}
