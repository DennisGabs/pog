package zoologico.entities;


public class Ave extends Animal {
    public static final String TIPO = "Ave";
    private String tipoPenas;

    public Ave(String nome, String especie) {
        super(nome, especie);
    }

    public void setTipoPenas(String tipoPenas) {
        this.tipoPenas = tipoPenas;
    }

    public String getTipoPenas() {
        return tipoPenas;
    }

    @Override
    protected void emitirSom() {
        System.out.println( getNome() +" é uma ave");
    }

    @Override
    public String toString() {
        return "Ave{" + super.toString() +
                ", tipoPenas='" + tipoPenas + '\'' +
                '}';
    }

    @Override
    public String getTipo() {
        return TIPO;
    }
}
