import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CalculoIR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale brasil = new Locale("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);

        System.out.println("CALCULO DO IMPOSTO DE RENDA");
        System.out.print("Digite seu salário bruto anual (R$): ");
        double salarioAnual = scanner.nextDouble();

        final double[] FAIXAS = {0, 22847.76, 33919.80, 45012.60, 55976.16};
        final double[] ALIQUOTAS = {0, 0.075, 0.15, 0.225, 0.275};
        final double[] DEDUCOES = {0, 1713.58, 4257.57, 7633.51, 10432.32};

        double imposto = 0;

        for (int i = 1; i < FAIXAS.length; i++) {
            if (salarioAnual > FAIXAS[i-1]) {
                double baseCalculo = Math.min(salarioAnual, FAIXAS[i]) - FAIXAS[i-1];
                imposto += baseCalculo * ALIQUOTAS[i];
            }
        }

        if (salarioAnual > FAIXAS[FAIXAS.length-1]) {
            imposto += (salarioAnual - FAIXAS[FAIXAS.length-1]) * ALIQUOTAS[ALIQUOTAS.length-1];
        }

        int faixaDeducao = 0;
        for (int i = 0; i < FAIXAS.length; i++) {
            if (salarioAnual > FAIXAS[i]) {
                faixaDeducao = i;
            }
        }

        imposto -= DEDUCOES[faixaDeducao];
        imposto = Math.max(imposto, 0);

        double salarioLiquido = salarioAnual - imposto;

        System.out.println("\nSEU IR ATUAL");
        System.out.println("Salário bruto anual: " + formatoMoeda.format(salarioAnual));
        System.out.println("Imposto a pagar: " + formatoMoeda.format(imposto));
        System.out.println("Salário líquido anual: " + formatoMoeda.format(salarioLiquido));
        System.out.println("Alíquota efetiva: " + String.format("%.2f", (imposto/salarioAnual*100)) + "%");

        scanner.close();
    }
}