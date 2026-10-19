import java.util.Scanner;
public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        System.out.print("Número para pesquisar: ");
        int pesquisa = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == pesquisa) {
                    System.out.println("Encontrado na linha " + i + ", coluna " + j + " (índices começando em 0).");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) System.out.println("Número não encontrado.");
        scanner.close();
    }
}
