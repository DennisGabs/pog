package cn.livraria;

public class Autor implements Details {
    private String nomeDoAutor;
    private String emailDoAutor;
    private String cpfDoAutor;

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
        System.out.println("nome do autor: " + nomeDoAutor);
        System.out.println("email do autor: " + emailDoAutor);
        System.out.println("cpf do autor: " + cpfDoAutor);
    }

}
