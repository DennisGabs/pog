package cn.livraria.application;

import cn.livraria.entities.Autor;
import cn.livraria.entities.Livro;

public class TesteSobreCarga {
    public static void main(String[] args) {
        Autor autor = new Autor("cavalo", "cavalo@gmail.com", "12345678910");
        Livro livro = new Livro("teste", "descricao de teste", 20.0, "123-456-789-X", autor);
        livro.mostrarDetalhes();
    }
}
