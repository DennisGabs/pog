package lista01.questao04;

public class ContaPoupanca extends Conta {
    public void renderJuros(int meses, double tax){
        setSaldo(getSaldo() * (Math.pow((1 + tax), meses)));
    }
}
