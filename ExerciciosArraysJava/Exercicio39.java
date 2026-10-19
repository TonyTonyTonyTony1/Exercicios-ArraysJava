import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        System.out.println("Diagonal principal:");
        for (int i = 0; i < 3; i++) System.out.println(matriz[i][i]);
        scanner.close();
    }
}
