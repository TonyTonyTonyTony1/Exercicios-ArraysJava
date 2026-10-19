import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 != 0) soma += numeros[i];
        }
        System.out.println("Soma dos números ímpares: " + soma);
        scanner.close();
    }
}
