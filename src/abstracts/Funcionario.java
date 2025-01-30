package abstracts;

public class Funcionario {
    static double salarioTotal;
    private String nome;
    private double salario;
    static int countFuncionarios;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        mudaSalario(this);
        countFuncionarios++;
    }

    private void mudaSalario(Funcionario funcionario){
        salarioTotal += funcionario.salario;
    }
}
