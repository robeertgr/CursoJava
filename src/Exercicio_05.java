/*
    Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário
    de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
    Calcule e mostre o valor a ser pago.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("PEÇA 1:");
        System.out.print("Código da peça: ");
        int CodigoPeca1 = sc.nextInt();
        System.out.print("Quantidade: ");
        int QuantidadePecas1 = sc.nextInt();
        System.out.print("Valor unitário: R$ ");
        double ValorUnitarioPeca1 = sc.nextDouble();
        System.out.println("PEÇA 2:");
        System.out.print("Código da peça: ");
        int CodigoPeca2 = sc.nextInt();
        System.out.print("Quantidade: ");
        int QuantidadePecas2 = sc.nextInt();
        System.out.print("Valor unitário: R$ ");
        double ValorUnitarioPeca2 = sc.nextDouble();

        double TotalPedido = (QuantidadePecas1 * ValorUnitarioPeca1) + (QuantidadePecas2 * ValorUnitarioPeca2);

        System.out.printf("Valor a pagar: R$ %.2f", TotalPedido);

        sc.close();
    }
}
