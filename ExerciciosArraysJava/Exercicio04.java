import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        System.out.printf("Média final: %.2f%n", soma / notas.length);
        scanner.close();
    }
}
