import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        boolean repetido = false;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) repetido = true;
            }
        }
        System.out.println(repetido ? "Existe número repetido." : "Não existem números repetidos.");
        scanner.close();
    }
}
