import java.util.Scanner;
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[5];
        int[] quantidades = new int[5];
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine();
            System.out.print("Quantidade em estoque de " + produtos[i] + ": ");
            quantidades[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("\nProdutos com estoque abaixo de 5 unidades:");
        boolean abaixo = false;
        for (int i = 0; i < produtos.length; i++) {
            if (quantidades[i] < 5) {
                System.out.println(produtos[i] + " - " + quantidades[i] + " unidade(s)");
                abaixo = true;
            }
        }
        if (!abaixo) System.out.println("Nenhum produto está abaixo de 5 unidades.");
        scanner.close();
    }
}
