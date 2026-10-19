import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Cadastre o produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();
        }
        System.out.println("\nMENU");
        System.out.println("1. Listar todos os produtos");
        System.out.println("2. Buscar produto pelo nome");
        System.out.println("3. Mostrar quantidade de produtos cadastrados");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                for (String produto : produtos) System.out.println(produto);
                break;
            case 2:
                System.out.print("Nome do produto para buscar: ");
                String pesquisa = scanner.nextLine();
                boolean encontrado = false;
                for (String produto : produtos) {
                    if (produto.equalsIgnoreCase(pesquisa)) {
                        System.out.println("Produto encontrado: " + produto);
                        encontrado = true;
                    }
                }
                if (!encontrado) System.out.println("Produto não encontrado.");
                break;
            case 3:
                System.out.println("Quantidade de produtos cadastrados: " + produtos.length);
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
