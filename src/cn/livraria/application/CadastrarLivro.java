package cn.livraria.application;

import cn.livraria.entities.Autor;
import cn.livraria.entities.Livro;

import java.util.Locale;

public class CadastrarLivro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Livro livro = new Livro();
        livro.setNome("Deitel Como programar em Java 6a edicao");
        livro.setDescricao("Java é foda");
        livro.setIsbn("987-65-4321-12-3");
        livro.setValor(59.90);

        Autor autor = new Autor();
        autor.setNomeDoAutor("Dennis");
        autor.setEmailDoAutor("dennisgabr9876@gmail.com");
        autor.setCpfDoAutor("98981319597");

        livro.setAutor(autor);

        System.out.println(livro);
        livro.mostrarDetalhes();
    }
}
