import java.util.Scanner;
public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[4];
        double[][] notas = new double[4][3];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota " + (j + 1) + " de " + nomes[i] + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("\nBoletim:");
        for (int i = 0; i < nomes.length; i++) {
            double soma = 0;
            System.out.print(nomes[i] + " | Notas: ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + (j < notas[i].length - 1 ? ", " : ""));
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            String situacao = media >= 7 ? "Aprovado" : "Reprovado";
            System.out.printf(" | Média: %.2f | Situação: %s%n", media, situacao);
        }
        scanner.close();
    }
}
