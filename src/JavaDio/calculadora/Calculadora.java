package JavaDio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = ler.nextInt();

        int somar = somar(a, b);
        int dividir = dividir(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);

        System.out.println("somar: " + somar);
        System.out.println("dividir: " + dividir);
        System.out.println("subtrair: " + subtrair);
        System.out.println("multiplicar: " + multiplicar);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }


}
