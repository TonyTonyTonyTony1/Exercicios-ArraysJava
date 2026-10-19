import java.util.Scanner;
import java.util.Arrays;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5], array2 = new int[5], soma = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + " do primeiro array: ");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + " do segundo array: ");
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) soma[i] = array1[i] + array2[i];
        System.out.println("Array com as somas: " + Arrays.toString(soma));
        scanner.close();
    }
}
