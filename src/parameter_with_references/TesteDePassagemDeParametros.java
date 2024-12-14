package parameter_with_references;

public class TesteDePassagemDeParametros {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 20;
        alterarValor(circulo);
        System.out.println(circulo.raio);  // 100

        int valor = 20;
        alterarValor(valor);
        System.out.println(valor); //20

    }

    public static void alterarValor(Circulo circulo){
        circulo.raio = 100;
    }

    public static void alterarValor(int valor){
        valor = 100;
    }

}
