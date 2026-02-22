package service;

import model.Livro;
import java.util.ArrayList;

class BibliotecaService {

    ArrayList<Livro> livros = new ArrayList<>();

    public void cadastrarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Livros cadastrados:");
            for (Livro livro : livros) {
                System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
            }
        }
    }
}