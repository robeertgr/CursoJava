/*
    Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor
    que recebe por hora e calcular o salário desse funcionário. A seguir, mostre o número e o salário
    do funcionário, com duas casas decimais
*/

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número do funcionário: ");
        int NumeroFuncionario = sc.nextInt();
        System.out.print("Informe o número de horas trabalhadas: ");
        int NumeroHorasTrabalhadas = sc.nextInt();
        System.out.print("Informe o valor por hora trabalhada: ");
        double ValorHoraTrabalhada = sc.nextDouble();

        double salario = NumeroHorasTrabalhadas * ValorHoraTrabalhada;

        System.out.println("Número do funcionário: " + NumeroFuncionario);
        System.out.println("Salário do funcionário: R$ " + salario);

        sc.close();
    }
}
