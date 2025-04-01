import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CalculoIdadeDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULANDO IDADE EM DIAS - EXERCICIO 4");

        System.out.print("Digite o dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês de nascimento: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano de nascimento (4 dígitos): ");
        int ano = scanner.nextInt();

        if (!isDataValida(dia, mes, ano)) {
            System.out.println("Data inválida! Verifique os valores.");
            System.exit(0);
        }

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();
        long diasDeVida = calcularDiasDeVida(dataNascimento, dataAtual);

        System.out.printf("\nVocê já viveu aproximadamente %,d dias!", diasDeVida);

        scanner.close();
    }

    private static boolean isDataValida(int dia, int mes, int ano) {
        try {
            LocalDate.of(ano, mes, dia);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static long calcularDiasDeVida(LocalDate inicio, LocalDate fim) {
        long diasComuns = Period.between(inicio, fim).getYears() * 365L;
        int bissextos = contarAnosBissextos(inicio, fim);
        return diasComuns + bissextos + Period.between(inicio, fim).getDays();
    }

    private static int contarAnosBissextos(LocalDate inicio, LocalDate fim) {
        int total = 0;
        for (int ano = inicio.getYear(); ano <= fim.getYear(); ano++) {
            if ((ano % 400 == 0) || (ano % 100 != 0 && ano % 4 == 0)) {
                total++;
            }
        }
        return total;
    }
}