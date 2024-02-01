package com.mt3;

public class SocioNaoPagante extends AquisicaoBilheteTemplate {

    @Override
    void autenticacao() {
        System.out.println("Autenticando sócio não pagante...");
    }

    @Override
    void escolhaLugar() {
        System.out.println("A escolher lugar para sócio não pagante...");
    }

    @Override
    void aplicarPromocoes() {
        System.out.println("Aplicando promoções para sócio não pagante...");
    }

    @Override
    double calcularPreco(double precoBase) {
        return precoBase;
    }

    @Override
    double pagamento(double precoTotal) {
        System.out.println("Sócio não pagante realizando o pagamento de" + precoTotal + "€");
        return precoTotal;
    }

    @Override
    void enviarBilhetePorEmail() {
        System.out.println("Enviando bilhete por email para sócio não pagante...");
    }

}
