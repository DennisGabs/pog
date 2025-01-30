package lista01.questao04;

public class Conta {
    private double saldo;
    private String titular;

    public Conta(){
        this.saldo = 0;
    }

    public Conta(String titular){
        this.titular = titular;
    }

    public Conta(double saldo, String titular ){
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double amount){
        saldo += amount;
    }

    public void sacar(double amount){
        if(amount > 0 && this.saldo >= amount)
            this.saldo -= amount;
        else
            throw new RuntimeException("Conta sem saldo, ou valor de saque acima do permitido!");
    }


}
