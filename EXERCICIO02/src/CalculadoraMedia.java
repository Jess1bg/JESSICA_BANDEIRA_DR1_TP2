import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculando média bimestral");
        System.out.print("Digite a sua 1ª nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a sua 2ª nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a sua 3ª nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a sua 4ª nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        String situacao;
        if (media >= 7) {
            situacao = "APROVADO(A)";
        } else if (media >= 5) {
            situacao = "EM RECUPERAÇÃO";
        } else {
            situacao = "REPROVADO(A)";
        }

        System.out.printf("\nMédia final: %.1f - Situação: %s", media, situacao);

        scanner.close();
    }
}