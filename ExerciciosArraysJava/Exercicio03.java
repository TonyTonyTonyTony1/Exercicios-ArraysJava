import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        System.out.println("Soma total: " + soma);
        scanner.close();
    }
}
