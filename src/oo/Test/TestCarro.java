package oo.Test;

public class TestCarro {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "Passat";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;

        meuCarro.liga();

        meuCarro.acelera(40);
        System.out.println(meuCarro.velocidadeAtual);
        meuCarro.pegaMarcha();
        System.out.println("Esta na " + meuCarro.pegaMarcha() + " marcha..");
    }
}
