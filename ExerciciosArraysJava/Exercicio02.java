import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[6];
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }
        System.out.println("Idades digitadas:");
        for (int idade : idades) System.out.println(idade);
        scanner.close();
    }
}
