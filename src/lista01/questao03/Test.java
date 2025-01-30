package lista01.questao03;

public class Test {
    public static void main(String[] args) {
        Calculadora calculadora = Calculadora.INSTANCE();
        calculadora.somar(5, 10);
        calculadora.subtrair(30, 20);
        calculadora.divisao(6, 2);
        calculadora.multiplicar(2, 3);
    }
}
