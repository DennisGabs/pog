package zoologico.entities;

public class Ave extends Animal{
    private String tipoPenas;

    public Ave(){
        totalAnimais += 1;
    }

    public void setTipoPenas(String tipoPenas) {
        this.tipoPenas = tipoPenas;
    }

    public String getTipoPenas() {
        return tipoPenas;
    }

    @Override
    protected void emitirSom() {
        System.out.println("Eu sou uma ave");
    }
}
