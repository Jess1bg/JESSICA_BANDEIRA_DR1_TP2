import java.util.Scanner;

public class SequenciaPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("GERANDO SEQUÊNCIA NUMÉRICA");
        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        if (incremento <= 0) {
            System.out.println("O incremento deve ser positivo!");
            System.exit(0);
        }

        System.out.println("\nSequência gerada:");

        int valorAtual = valorInicial;
        boolean primeiroNumero = true;

        while (valorAtual <= 100) {
            if (!primeiroNumero) {
                System.out.print(", ");
            }
            System.out.print(valorAtual);
            valorAtual += incremento;
            primeiroNumero = false;
        }

        System.out.println();
        scanner.close();
    }
}