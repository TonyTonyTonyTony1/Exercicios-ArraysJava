import java.util.Scanner;
public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[4][3];
        for (int i = 0; i < notas.length; i++)
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) soma += notas[i][j];
            System.out.printf("Média do aluno %d: %.2f%n", i + 1, soma / notas[i].length);
        }
        scanner.close();
    }
}
