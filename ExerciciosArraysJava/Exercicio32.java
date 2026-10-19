import java.util.Scanner;
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        System.out.println("Soma de todos os valores: " + soma);
        scanner.close();
    }
}
