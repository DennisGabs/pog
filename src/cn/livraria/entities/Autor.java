package cn.livraria.entities;

import cn.livraria.interfaces.Details;

public class Autor implements Details {
    private String nomeDoAutor;
    private String emailDoAutor;
    private String cpfDoAutor;

    public Autor() {}

    public Autor(String nome, String email, String cpf) {
        this.nomeDoAutor = nome;
        this.emailDoAutor = email;
        this.cpfDoAutor = cpf;
    }

    public String getNomeDoAutor() {
        return nomeDoAutor;
    }

    public void setNomeDoAutor(String nomeDoAutor) {
        this.nomeDoAutor = nomeDoAutor;
    }

    public String getEmailDoAutor() {
        return emailDoAutor;
    }

    public void setEmailDoAutor(String emailDoAutor) {
        this.emailDoAutor = emailDoAutor;
    }

    public String getCpfDoAutor() {
        return cpfDoAutor;
    }

    public void setCpfDoAutor(String cpfDoAutor) {
        this.cpfDoAutor = cpfDoAutor;
    }

    @Override
    public void mostrarDetalhes(){
        System.out.println("Detalhes do Autor: ");
        System.out.println("Nome do autor: " + nomeDoAutor);
        System.out.println("Email do autor: " + emailDoAutor);
        System.out.println("CPF do autor: " + cpfDoAutor);
    }

}
