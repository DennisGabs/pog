package sistema_pagamento.entities.dto;

public abstract class FuncionarioDTO {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract double calcularSalario();

    public String toString(){
        return "Nome da classe: " + getClass().getSimpleName()
                + "\nNome: " + nome
                + "\nCPF: " + cpf
                + "\nsalario: "+ calcularSalario() +"\n";
    }
}
