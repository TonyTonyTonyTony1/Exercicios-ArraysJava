import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int[] dobros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
            dobros[i] = numeros[i] * 2;
        }
        System.out.println("Array original: " + java.util.Arrays.toString(numeros));
        System.out.println("Array com os dobros: " + java.util.Arrays.toString(dobros));
        scanner.close();
    }
}
