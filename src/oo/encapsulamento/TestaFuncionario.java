package oo.encapsulamento;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.setNome("Ary");
        func.setSalario(2500);

        System.out.println(func.getNome());
        System.out.println(func.getSalario());
    }
}
