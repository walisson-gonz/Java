package oo.intellij;

import java.util.Scanner;

public class Vetor1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
        int[] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45};

        float[] nota = new float[5];

        //tamanho do array
        if (arrayUm.length > 8) {
            System.out.println("Tamado do ArrayDois - Maior que 8!");
        } else {
            System.out.println("Tamanho do ArrayDois - Menor que 8!");
        }
        System.out.println("\ntamanho do ArrayUm = " + arrayUm.length);

        //Utilização do for-each
        String[] cars = {"Volvo", "", "Ford", "Mazda"};

        for (String i : cars) {
            System.out.println(i);
        }

        //Populando um Array
        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com uma nota: ");
            nota[i] = ler.nextFloat();
        }
        //Apresentando um Array
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota " + i + 1 + " = " + nota[i]);
        }
    }
}