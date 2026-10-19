import java.util.Scanner;
public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < matriz[i].length; j++) somaLinha += matriz[i][j];
            System.out.println("Soma da linha " + i + ": " + somaLinha);
        }
        scanner.close();
    }
}
