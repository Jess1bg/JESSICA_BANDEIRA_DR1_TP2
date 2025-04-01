import java.util.Scanner;
import java.util.Random;

public class GameAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("BEM VINDO AO GAME DE ADIVINHAÇÃO");
        System.out.println("Tente adivinhar o número entre 1 e 100");

        do {
            System.out.print("\nQual o seu palpite? ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Dica: É MAIOR que " + palpite);
            } else if (palpite > numeroSecreto) {
                System.out.println("Dica: É MENOR que " + palpite);
            }

        } while (palpite != numeroSecreto);

        System.out.println("\nPARABÉNS! Você acertou em " + tentativas + " tentativas!");
        System.out.println("O número secreto era: " + numeroSecreto);

        scanner.close();
    }
}