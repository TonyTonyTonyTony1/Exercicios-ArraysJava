import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        System.out.print("Digite o nome que deseja pesquisar: ");
        String pesquisa = scanner.nextLine();
        boolean encontrado = false;
        for (String nome : nomes) if (pesquisa.equalsIgnoreCase(nome)) encontrado = true;
        System.out.println(encontrado ? "Nome encontrado." : "Nome não encontrado.");
        scanner.close();
    }
}
