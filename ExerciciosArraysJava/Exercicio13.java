import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Digite o número para pesquisar: ");
        int pesquisa = scanner.nextInt();
        int contador = 0;
        for (int numero : numeros) if (numero == pesquisa) contador++;
        System.out.println("O número aparece " + contador + " vez(es).");
        scanner.close();
    }
}
