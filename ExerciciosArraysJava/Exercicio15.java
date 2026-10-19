import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Dobro de cada valor:");
        for (int numero : numeros) System.out.println(numero * 2);
        scanner.close();
    }
}
