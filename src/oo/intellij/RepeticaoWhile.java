package oo.intellij;

import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.printf("Entre com sua idade: ");
        idade = ler.nextInt();

        while (idade>=1)
        {
            System.out.printf("Sua idade: %d", idade);
            if(idade>=18)
            {
                System.out.printf("\nVocê é maior de idade...");
            }
            else
            {
                System.out.printf("\nVocê é menor...");
            }

            System.out.printf("\nDiga sua idade ou precione 0 para sair! ");
            idade = ler.nextInt();
        }
    }
}
