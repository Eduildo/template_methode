package com.mt3;

public abstract class AquisicaoBilheteTemplate {
    public void adquirirBilhete() {
        autenticacao();
        escolhaLugar();
        aplicarPromocoes();
        double precoTotal = calcularPreco(100);
        precoTotal = pagamento(precoTotal);
        enviarBilhetePorEmail();
    }

    abstract void autenticacao();

    abstract void escolhaLugar();

    abstract void aplicarPromocoes();

    abstract double calcularPreco(double precoBase);

    abstract double pagamento(double precoTotal);

    abstract void enviarBilhetePorEmail();
}
