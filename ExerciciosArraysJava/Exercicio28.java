import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] notas = new double[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Nota de " + nomes[i] + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println("\nRelatório de alunos:");
        for (int i = 0; i < nomes.length; i++) {
            String situacao = notas[i] >= 7 ? "Aprovado" : "Reprovado";
            System.out.printf("%s | Nota: %.2f | Situação: %s%n", nomes[i], notas[i], situacao);
        }
        scanner.close();
    }
}
