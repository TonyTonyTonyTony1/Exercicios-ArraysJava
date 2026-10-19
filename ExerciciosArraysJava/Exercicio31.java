import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        System.out.println("Matriz:");
        for (int[] linha : matriz) {
            for (int valor : linha) System.out.print(valor + "\t");
            System.out.println();
        }
        scanner.close();
    }
}
