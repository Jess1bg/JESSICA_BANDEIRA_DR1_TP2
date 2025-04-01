import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {

        final double TAXA_DOLAR = 5.10;
        final double TAXA_EURO = 5.50;
        final double TAXA_BOLIVIANO = 0.74;

        Scanner scanner = new Scanner(System.in);

        System.out.println("CONVERTENDO MOEDAS EXERCICIO 03");
        System.out.print("Digite um valor em reais (R$): ");
        double valorReais = scanner.nextDouble();

        System.out.println("\nMoedas disponíveis:");
        System.out.println("1 - Dólar Americano (USD)");
        System.out.println("2 - Euro (EUR)");
        System.out.println("3 - Boliviano (BOB)");
        System.out.print("Escolha a moeda que deseja (1-3): ");
        int opcao = scanner.nextInt();

        double valorConvertido = 0;
        String moedaDestino = "";
        String simboloMoeda = "";

        switch (opcao) {
            case 1:
                valorConvertido = valorReais / TAXA_DOLAR;
                moedaDestino = "USD";
                simboloMoeda = "US$";
                break;
            case 2:
                valorConvertido = valorReais / TAXA_EURO;
                moedaDestino = "EUR";
                simboloMoeda = "€";
                break;
            case 3:
                valorConvertido = valorReais / TAXA_BOLIVIANO;
                moedaDestino = "BOB";
                simboloMoeda = "Bs";
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        System.out.printf("\nValor convertido: %s%.2f %s", simboloMoeda, valorConvertido, moedaDestino);

        scanner.close();
    }
}