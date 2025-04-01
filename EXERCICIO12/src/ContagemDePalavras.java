import java.util.Scanner;

public class ContagemDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONTANDO PALAVRAS");
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().trim();

        if (frase.isEmpty()) {
            System.out.println("Total de palavras: 0");
            return;
        }

        String[] palavras = frase.split("\\s+");
        int totalPalavras = palavras.length;

        System.out.println("Total de palavras: " + totalPalavras);

        scanner.close();
    }
}