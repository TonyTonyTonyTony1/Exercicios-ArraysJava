import java.util.Scanner;
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[6];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double maior = notas[0], menor = notas[0];
        for (double nota : notas) {
            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;
        }
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.printf("Média da turma: %.2f%n", soma / notas.length);
        scanner.close();
    }
}
