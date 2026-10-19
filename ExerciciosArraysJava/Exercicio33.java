import java.util.Scanner;
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        int maior = matriz[0][0];
        for (int[] linha : matriz) for (int valor : linha) if (valor > maior) maior = valor;
        System.out.println("Maior valor: " + maior);
        scanner.close();
    }
}
