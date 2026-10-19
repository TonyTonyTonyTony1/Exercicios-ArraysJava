import java.util.Scanner;
public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int positivos = 0, negativos = 0, zeros = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > 0) positivos++;
                else if (matriz[i][j] < 0) negativos++;
                else zeros++;
            }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
        scanner.close();
    }
}
