package src;

import java.util.Scanner;

public class main_projeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeLivros gerenciador = new GerenciadorDeLivros();
        int escolha;

        do {
            System.out.println("\nMenu do Sistema de Biblioteca:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Pesquisar por Título");
            System.out.println("3. Pesquisar por Autor");
            System.out.println("4. Listar Todos os Livros");
            System.out.println("5. Sair");
            System.out.print("Digite sua escolha: ");
            escolha = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha

            switch (escolha) {
                case 1:
                    System.out.print("Digite o título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o gênero: ");
                    String genero = scanner.nextLine();
                    System.out.print("Digite o ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();  // Consome a nova linha
                    gerenciador.adicionarLivro(new livro(titulo, autor, genero, ano));
                    System.out.println("Livro adicionado com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o título para pesquisa: ");
                    String tituloPesquisa = scanner.nextLine();
                    gerenciador.pesquisarPorTitulo(tituloPesquisa).forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Digite o autor para pesquisa: ");
                    String autorPesquisa = scanner.nextLine();
                    gerenciador.pesquisarPorAutor(autorPesquisa).forEach(System.out::println);
                    break;
                case 4:
                    gerenciador.listarLivros();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 5);

        scanner.close();
    }
}

