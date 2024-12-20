package zoologico.entities;

public class Mamifero extends Animal{
    public static final String TIPO = "Mamifero";
    private int tempoGestacao;

    public Mamifero(String nome, String especie){
        super(nome, especie);
    }


    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    @Override
    protected void emitirSom() {
        System.out.println( getNome() + " é um mamifero");
    }

    @Override
    public String getTipo() {
        return TIPO;
    }
}
