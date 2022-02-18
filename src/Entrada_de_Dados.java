import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_Dados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Entrando com uma String
//        String x;
//        x = sc.next();
//        System.out.println("Você digitou " + x);

//        Entrando com um inteiro
//        int x;
//        x = sc.nextInt();
//        System.out.println("Você digitou: " + x);

//        Entrando com um double (recebe a localidade do sistema)
//        Caso queira considerar o separador como ponto, usar o Locale.setDefault(Locale.US)

//        double x;
//        x = sc.nextDouble();
//        System.out.printf("Você digitou: %.2f\n", x);

//        char x;
//        x = sc.next().charAt(0);
//        System.out.println("Você digitou: " + x);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
