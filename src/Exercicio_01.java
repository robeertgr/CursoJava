// Faça um programa para ler dois valores inteiros, e depois mostrar na tela
// a soma desses números com uma mensagem explicativa, conforme exemplos.
// 10 + 30 = 40
// -30 + 10 = -20
// 0 + 0 = 0

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor 1: ");
        double valor1 = sc.nextDouble();
        System.out.print("Informe o valor 2: ");
        double valor2 = sc.nextDouble();
        double soma = valor1 + valor2;

        System.out.print("Soma = " + soma);

        sc.close();
    }
}
