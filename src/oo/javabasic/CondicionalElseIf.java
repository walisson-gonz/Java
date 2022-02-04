package oo.javabasic;

import java.util.Scanner;

public class CondicionalElseIf {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int idade;
        String nome;

        System.out.println("Qual a sua idade? ");
        idade = ler.nextInt();

        ler.nextLine(); //limpando boff de memoria

        System.out.printf("Me diga seu nome? ");
        nome = ler.nextLine(); //Line para nome

        System.out.printf("\nSeu nome: %s",nome);
        System.out.printf("\nSua idade: %d",idade);

        if (idade >= 18)
        {
            System.out.printf("\nVocê é maior de idade...");
        }
        else if(idade>=1 && idade<18)
        {
            System.out.printf("\nVocê é menor de idade...");
        }
        else
        {
            System.out.printf("\nVocê entrou com uma idade  inválida...");
        }
    }
}
