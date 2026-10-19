import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        System.out.println("\nNomes cadastrados:");
        for (String nome : nomes) System.out.println(nome);
        scanner.close();
    }
}
