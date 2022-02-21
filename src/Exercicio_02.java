/*
    Faça um programa para ler o valor do raio de um círculo, e depois
    mostrar o valor da área deste circulo com quatro casas decimais
    conforme exemplos:

    Fórmula da área: area = pi . raio²
    Considere o valor pi = 3.14159
*/

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Informe o valor do raio: ");
        double raio = sc.nextDouble();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("Area = %.2f", area);
        sc.close();
    }
}
