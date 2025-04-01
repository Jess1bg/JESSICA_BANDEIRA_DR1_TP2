import java.util.Scanner;

public class ClassificaTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CLASSIFICAÇÃO DE TRIÂNGULOS");
        System.out.println("Digite os comprimentos dos três lados do triângulo:");

        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();

        if (ehTrianguloValido(lado1, lado2, lado3)) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero pois possui os três lados iguais");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles tem apenas dois lados iguais");
            } else {
                System.out.println("Triângulo Escaleno tem todos os lados diferentes");
            }
        } else {
            System.out.println("Parece que encontramos algo errado, essas medidas NÃO formam um triângulo válido!");
        }

        scanner.close();
    }

    private static boolean ehTrianguloValido(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a)
                && (a > 0) && (b > 0) && (c > 0);
    }
}