import java.util.Scanner;
public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        System.out.print("Número multiplicador: ");
        int multiplicador = scanner.nextInt();
        System.out.println("Matriz multiplicada:");
        for (int[] linha : matriz) {
            for (int valor : linha) System.out.print((valor * multiplicador) + "\t");
            System.out.println();
        }
        scanner.close();
    }
}
