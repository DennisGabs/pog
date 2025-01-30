package lista01.questao04;

public class Test {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca();
        conta1.setTitular("Dennis");
        conta1.depositar(10);
        conta1.sacar(3.5);
        System.out.println(conta1.getSaldo());
        conta1.renderJuros(5, 1.5);
        System.out.println(conta1.getSaldo());
    }
}
