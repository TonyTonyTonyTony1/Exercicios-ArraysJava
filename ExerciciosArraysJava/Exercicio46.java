import java.util.Scanner;
public class Exercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        for (int i = 0; i < 3; i++) {
            int temporario = matriz[i][0];
            matriz[i][0] = matriz[i][2];
            matriz[i][2] = temporario;
        }
        System.out.println("Matriz após trocar a coluna 0 com a coluna 2:");
        for (int[] linha : matriz) {
            for (int valor : linha) System.out.print(valor + "\t");
            System.out.println();
        }
        scanner.close();
    }
}
