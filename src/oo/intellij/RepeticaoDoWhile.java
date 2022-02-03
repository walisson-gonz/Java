package oo.intellij;

import java.util.Scanner;

public class RepeticaoDoWhile {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade;

        do
        {
            System.out.printf("\nEntre com sua idade: ");
            idade = ler.nextInt();

            System.out.printf("Sua idade: %d", idade);
            if (idade>=18)
            {
                System.out.printf("\nVocê é maior...");
            }
            else
            {
                System.out.printf("\nVocê é menor...");
            }

        }

        while (idade>=1);
    }
}
