import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CalculadoraDescontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale brasil = new Locale("pt", "BR");

        System.out.println("CALCULANDO OS DESCONTOS");
        System.out.print("Digite o valor total da sua compra (R$): ");
        double valorCompra = scanner.nextDouble();

        double desconto;
        if (valorCompra > 1000) {
            desconto = 0.10;
        } else if (valorCompra >= 500) {
            desconto = 0.05;
        } else {
            desconto = 0;
        }

        double valorDesconto = valorCompra * desconto;
        double valorFinal = valorCompra - valorDesconto;

        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);

        System.out.println("\nCOMPRA REALIZADA");
        System.out.println("Valor original: " + formatoMoeda.format(valorCompra));
        System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        System.out.println("Valor do desconto: " + formatoMoeda.format(valorDesconto));
        System.out.println("Valor final: " + formatoMoeda.format(valorFinal));

        scanner.close();
    }
}