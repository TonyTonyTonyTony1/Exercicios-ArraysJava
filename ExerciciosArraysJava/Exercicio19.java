import java.util.Scanner;
import java.util.Arrays;
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        int temporario = numeros[0];
        numeros[0] = numeros[numeros.length - 1];
        numeros[numeros.length - 1] = temporario;
        System.out.println("Array alterado: " + Arrays.toString(numeros));
        scanner.close();
    }
}
