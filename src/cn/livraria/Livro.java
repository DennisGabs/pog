package cn.livraria;

public class Livro implements Details{
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(){}

    public Livro(String nome, String descricao, double valor, String isbn, Autor autor){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
        this.autor = autor;
    }

    public Autor getAutor(){
        return autor;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public void mostrarDetalhes(){
        System.out.println("=====================");
        System.out.println("Detalhes do Livro");
        System.out.println("nome: " + nome);
        System.out.println("descricao: "+ descricao);
        System.out.println("isbn: " + isbn);
        System.out.println("valor: " + valor);
        autor.mostrarDetalhes();
        System.out.println("=====================");
    }
}
