package com.mt3;

public class Main {
    public static void main(String[] args) {

        AquisicaoBilheteTemplate socioPagante = new SocioPagante();
        AquisicaoBilheteTemplate socioNaoPagante = new SocioNaoPagante();

        socioPagante.adquirirBilhete();
        socioNaoPagante.adquirirBilhete();
    }
}