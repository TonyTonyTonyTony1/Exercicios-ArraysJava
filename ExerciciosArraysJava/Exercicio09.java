import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int positivos = 0, negativos = 0, zeros = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] > 0) positivos++;
            else if (numeros[i] < 0) negativos++;
            else zeros++;
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
        scanner.close();
    }
}
