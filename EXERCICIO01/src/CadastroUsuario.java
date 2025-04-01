import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome completo? ");
        String nomeCompleto = scanner.nextLine();

        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Qual o nome da sua mãe? ");
        String nomeMae = scanner.nextLine();

        System.out.print("Qual o nome do seu pai? ");
        String nomePai = scanner.nextLine();

        scanner.close();

        System.out.println("\nINFORMAÇÕES DO USUARIO");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Mãe: " + nomeMae);
        System.out.println("Pai: " + nomePai);

        int tamanhoNome = nomeCompleto.length();
        int tamanhoMae = nomeMae.length();
        int tamanhoPai = nomePai.length();

        System.out.println("\nCOMPARANDO NOMES");
        System.out.println("Seu nome tem " + tamanhoNome + " letras.");
        System.out.println("Nome da mãe tem " + tamanhoMae + " letras.");
        System.out.println("Nome do pai tem " + tamanhoPai + " letras.");

        if (tamanhoNome > tamanhoMae && tamanhoNome > tamanhoPai) {
            System.out.println("Seu nome é MAIS longo que os nomes dos seus pais!");
        } else if (tamanhoNome > tamanhoMae) {
            System.out.println("Seu nome é MAIS longo que o da sua mãe!");
        } else if (tamanhoNome > tamanhoPai) {
            System.out.println("Seu nome é MAIS longo que o do seu pai!");
        } else {
            System.out.println("Seu nome é MENOR ou IGUAL em tamanho ao da sua mãe e/ou pai.");
        }
    }
}