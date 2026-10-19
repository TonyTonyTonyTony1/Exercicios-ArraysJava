import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.printf("Média: %.2f%nNotas acima da média:%n", media);
        for (double nota : notas) if (nota > media) System.out.println(nota);
        scanner.close();
    }
}
