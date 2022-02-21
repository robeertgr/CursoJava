/*
    Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
    A, B e C. Em seguida, calcule e mostre:

    A) a área do triângulo retângulo que tem A por base e C por altura.
    B) a área do circulo de raio C (pi = 3.14159).
    C) a área do trapézio que tem A e B por bases e C por altura.
    D) a área do quadrado que tem lado B.
    E) a área do retângulo que tem lados A e B.
*/

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Informe o valor de A: ");
        double A = sc.nextDouble();
        System.out.print("Informe o valor de B: ");
        double B = sc.nextDouble();
        System.out.print("Informe o valor de C: ");
        double C = sc.nextDouble();

        double AreaTrianguloRetangulo = (A * C) / 2;
        double AreaCirculo = pi * Math.pow(C, 2);
        double AreaTrapezio = ((A + B) / 2) * C;
        double AreaQuadrado = B * B;
        double AreaRetangulo = A * B;

        System.out.println("\nArea do triângulo retângulo: " + AreaTrianguloRetangulo);
        System.out.println("Area do circulo: " + AreaCirculo);
        System.out.println("Area do trapézio: " + AreaTrapezio);
        System.out.println("Area do quadrado: " + AreaQuadrado);
        System.out.println("Area do retângulo: " + AreaRetangulo);

        sc.close();
    }
}
