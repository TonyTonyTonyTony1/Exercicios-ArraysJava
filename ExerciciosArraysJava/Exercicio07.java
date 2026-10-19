import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) pares++;
        }
        System.out.println("Quantidade de números pares: " + pares);
        scanner.close();
    }
}
