import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Digite o multiplicador: ");
        int multiplicador = scanner.nextInt();
        System.out.println("Valores multiplicados:");
        for (int numero : numeros) System.out.println(numero * multiplicador);
        scanner.close();
    }
}
