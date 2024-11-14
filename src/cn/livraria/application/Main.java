package cn.livraria.application;

import cn.livraria.entities.Autor;
import cn.livraria.entities.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Aventuras de Dennis Lindo",
                              "belas aventuras",
                            20.000, "XXXXXXXXXX-X", new Autor());
        System.out.println(livro.getNome());
        System.out.println(livro);

        Livro livro2 = new Livro();
        livro2.setNome("a batalha do apocalipse");
        livro2.setDescricao("livro top demais");
        System.out.println(livro2);
    }
}
