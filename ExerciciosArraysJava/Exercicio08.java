import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int impares = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 != 0) impares++;
        }
        System.out.println("Quantidade de números ímpares: " + impares);
        scanner.close();
    }
}
