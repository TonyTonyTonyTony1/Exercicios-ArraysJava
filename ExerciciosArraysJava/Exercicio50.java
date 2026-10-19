import java.util.Scanner;
public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] estoque = new int[3][5];
        int[] totaisLojas = new int[3];
        int[] totaisProdutos = new int[5];
        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.print("Quantidade do produto " + (j + 1) + " na loja " + (i + 1) + ": ");
                estoque[i][j] = scanner.nextInt();
                totaisLojas[i] += estoque[i][j];
                totaisProdutos[j] += estoque[i][j];
            }
        }
        int maiorLoja = 0;
        System.out.println("\nTotal de produtos por loja:");
        for (int i = 0; i < totaisLojas.length; i++) {
            System.out.println("Loja " + (i + 1) + ": " + totaisLojas[i]);
            if (totaisLojas[i] > totaisLojas[maiorLoja]) maiorLoja = i;
        }
        System.out.println("\nTotal de cada produto em todas as lojas:");
        for (int j = 0; j < totaisProdutos.length; j++)
            System.out.println("Produto " + (j + 1) + ": " + totaisProdutos[j]);
        System.out.println("Loja com maior estoque total: loja " + (maiorLoja + 1) + " (" + totaisLojas[maiorLoja] + " produtos).");
        scanner.close();
    }
}
