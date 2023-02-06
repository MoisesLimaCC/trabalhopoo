package br.uern.di.poo.unidade1.construcao;

public class Main {

    public static void main(String[] args) {
        Porta porta1 = new Porta(TipoDePorta.SIMPLES, 0.7f, 1.8f, false);
        Porta porta2 = new Porta(TipoDePorta.PADRAO, 0.7f, 1.8f, false);
        Porta porta3 = new Porta(TipoDePorta.LUXO, 0.7f, 1.8f, true);
        Porta porta4 = new Porta(TipoDePorta.SIMPLES, 0.7f, 1.8f, false);

        System.out.println("Porta 1");
        System.out.println(porta1.exibePorta());
        System.out.println("Preço: " + porta1.calculaPreco());
        System.out.println("\n");

        System.out.println("Porta 2");
        System.out.println(porta2.exibePorta());
        System.out.println("Preço: " + porta2.calculaPreco());
        System.out.println("\n");

        System.out.println("Porta 3");
        System.out.println(porta3.exibePorta());
        System.out.println("Preço: " + porta3.calculaPreco());
        System.out.println("\n");

        System.out.println("Porta 4");
        System.out.println(porta4.exibePorta());
        System.out.println("Preço: " + porta4.calculaPreco());
    }
}
