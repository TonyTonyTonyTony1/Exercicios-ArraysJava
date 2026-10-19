import java.util.Scanner;
public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int pares = 0;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] % 2 == 0) pares++;
            }
        System.out.println("Quantidade de números pares: " + pares);
        scanner.close();
    }
}
