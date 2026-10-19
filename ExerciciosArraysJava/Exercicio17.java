import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];
        int aprovados = 0, reprovados = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            if (notas[i] >= 7) aprovados++;
            else reprovados++;
        }
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        scanner.close();
    }
}
