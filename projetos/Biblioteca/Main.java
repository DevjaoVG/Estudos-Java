import service.BibliotecaService;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        BibliotecaService bibliotecaService = new BibliotecaService();
        
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Listar livros");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();

                    bibliotecaService.cadastrarLivro(titulo, autor);
                    break;

                case 2:
                    bibliotecaService.listarLivros();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}