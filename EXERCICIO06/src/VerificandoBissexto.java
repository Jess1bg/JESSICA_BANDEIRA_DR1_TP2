import java.util.Scanner;

public class VerificandoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("VERIFICANDO SE O ANO É BISSEXTO");
        System.out.print("Digite um ano (4 dígitos): ");
        int ano = scanner.nextInt();

        boolean isBissexto = false;

        if (ano % 400 == 0) {
            isBissexto = true;
        } else if (ano % 100 == 0) {
            isBissexto = false;
        } else if (ano % 4 == 0) {
            isBissexto = true;
        }

        System.out.printf("\nO ano %d %s bissexto.",
                ano,
                isBissexto ? "é" : "não é");

        scanner.close();
    }
}