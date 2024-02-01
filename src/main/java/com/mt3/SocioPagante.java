package com.mt3;

public class SocioPagante extends AquisicaoBilheteTemplate {

    @Override
    void autenticacao() {
        System.out.println("Autenticando sócio pagante...");
    }

    @Override
    void escolhaLugar() {
        System.out.println("Escolhendo lugar para sócio pagante...");

    }

    @Override
    void aplicarPromocoes() {
        System.out.println("Aplicando promoções para sócio pagante...");
    }

    @Override
    double calcularPreco(double precoBase) {
        return precoBase * 0.9;
    }

    @Override
    double pagamento(double precoTotal) {
        System.out.println("Sócio pagante realizando o pagamento de" + precoTotal + "€");
        return precoTotal;

    }

    @Override
    void enviarBilhetePorEmail() {
        System.out.println("Enviando bilhete por email para sócio pagante...");
    }

}
