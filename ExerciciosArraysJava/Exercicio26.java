import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[6];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        System.out.println("Nomes com mais de 5 letras:");
        for (String nome : nomes) if (nome.replace(" ", "").length() > 5) System.out.println(nome);
        scanner.close();
    }
}
