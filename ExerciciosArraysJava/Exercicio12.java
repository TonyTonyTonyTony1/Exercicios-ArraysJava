import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Digite o número para pesquisar: ");
        int pesquisa = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == pesquisa) {
                System.out.println("Encontrado na posição " + i + " (índice começando em 0).");
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Número não encontrado.");
        scanner.close();
    }
}
