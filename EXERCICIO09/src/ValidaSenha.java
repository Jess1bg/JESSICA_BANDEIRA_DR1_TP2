import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CADASTRO DE SENHA");
        System.out.print("Digite sua nova senha: ");
        String senhaCadastrada = scanner.nextLine();

        String senhaDigitada;
        int tentativas = 0;

        do {
            System.out.print("\nConfirme sua senha: ");
            senhaDigitada = scanner.nextLine();
            tentativas++;

            if (!senhaDigitada.equals(senhaCadastrada)) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        } while (!senhaDigitada.equals(senhaCadastrada));

        System.out.println("\n✅ Senha confirmada com sucesso! (Tentativas: " + tentativas + ")");

        scanner.close();
    }
}