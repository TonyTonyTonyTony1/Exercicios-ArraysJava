import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) if (numeros[i] > maior) maior = numeros[i];
        System.out.println("Maior número: " + maior);
        scanner.close();
    }
}
