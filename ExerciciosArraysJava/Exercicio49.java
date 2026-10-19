import java.util.Scanner;
public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] vendas = new int[3][4];
        int[] totais = new int[3];
        for (int i = 0; i < vendas.length; i++)
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.print("Venda " + (j + 1) + " do vendedor " + (i + 1) + ": ");
                vendas[i][j] = scanner.nextInt();
                totais[i] += vendas[i][j];
            }
        int maiorIndice = 0;
        for (int i = 0; i < totais.length; i++) {
            System.out.println("Total vendido pelo vendedor " + (i + 1) + ": " + totais[i]);
            if (totais[i] > totais[maiorIndice]) maiorIndice = i;
        }
        System.out.println("Vendedor com maior total vendido: vendedor " + (maiorIndice + 1) + " (" + totais[maiorIndice] + ").");
        scanner.close();
    }
}
