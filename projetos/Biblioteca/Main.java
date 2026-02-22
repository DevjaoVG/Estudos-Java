import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Listar livros");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    break;

                case 2:
                    // Aqui você pode listar os livros cadastrados
                    System.out.println("Listando livros...");
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