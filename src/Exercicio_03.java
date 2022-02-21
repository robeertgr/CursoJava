/*
    Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule
    e mostre a diferença do produto de A e B pelo produto de C e D seguindo a fórmula:

    diferença = (A * B - C * D)

*/

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        double A = sc.nextDouble();
        System.out.print("Informe o valor de B: ");
        double B = sc.nextDouble();
        System.out.print("Informe o valor de C: ");
        double C = sc.nextDouble();
        System.out.print("Informe o valor de D: ");
        double D = sc.nextDouble();

        double diferenca = (A * B - C * D);

        System.out.println("Resultado: " + diferenca);

        sc.close();
    }
}
