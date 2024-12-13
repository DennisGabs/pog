package statics;

public class Funcionario {
    static double salarioTotal;
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        mudaSalario(this);
    }

    private void mudaSalario(Funcionario funcionario){
        salarioTotal += funcionario.salario;
    }
}
