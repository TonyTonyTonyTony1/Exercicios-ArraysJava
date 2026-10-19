import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5], array2 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + " do primeiro array: ");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + " do segundo array: ");
            array2[i] = scanner.nextInt();
        }
        boolean iguais = true;
        for (int i = 0; i < 5; i++) if (array1[i] != array2[i]) iguais = false;
        System.out.println(iguais ? "Os arrays são iguais." : "Os arrays são diferentes.");
        scanner.close();
    }
}
