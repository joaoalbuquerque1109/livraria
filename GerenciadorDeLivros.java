package src;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeLivros {
    private List<livro> livros;

    public GerenciadorDeLivros() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(livro livro) {
        livros.add(livro);
    }

    public List<livro> pesquisarPorTitulo(String titulo) {
        List<livro> resultados = new ArrayList<>();
        for (livro livro : livros) {
            if (livro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                resultados.add(livro);
            }
        }
        return resultados;
    }

    public List<livro> pesquisarPorAutor(String autor) {
        List<livro> resultados = new ArrayList<>();
        for (livro livro : livros) {
            if (livro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                resultados.add(livro);
            }
        }
        return resultados;
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro disponível.");
        } else {
            for (livro livro : livros) {
                System.out.println(livro);
            }
        }
    }
}

