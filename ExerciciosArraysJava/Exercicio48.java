import java.util.Scanner;
public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        int[][] transposta = new int[3][2];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) transposta[j][i] = matriz[i][j];
        System.out.println("Matriz original:");
        for (int[] linha : matriz) {
            for (int valor : linha) System.out.print(valor + "\t");
            System.out.println();
        }
        System.out.println("Matriz transposta:");
        for (int[] linha : transposta) {
            for (int valor : linha) System.out.print(valor + "\t");
            System.out.println();
        }
        scanner.close();
    }
}
