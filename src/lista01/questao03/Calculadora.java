package lista01.questao03;

public class Calculadora {
    private static Calculadora INSTANCE;
    private Calculadora(){}

    public void somar(double n1, double n2){
        double soma = (n1 + n2);
        System.out.println(soma);
    }

    public void subtrair(double n1, double n2){
        double subtracao = n1 - n2;
        System.out.println(subtracao);
    }

    public void multiplicar(double n1, double n2){
        double mult = n1 * n2;
        System.out.println(mult);
    }

    public void divisao(double n1, double n2){
        double div = n1 / n2;
        System.out.println(div);
    }

    public static Calculadora INSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new Calculadora();
        }

        return INSTANCE;
    }
}
