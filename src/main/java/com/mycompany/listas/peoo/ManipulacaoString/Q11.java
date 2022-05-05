package com.mycompany.listas.peoo.ManipulacaoString;

public class Q11 {

    public static void main(String[] args) {

        StringBuilder texto = new StringBuilder();

        texto.append("ABRACADABRA");
        texto.delete(4, 8);
        System.out.println();
        String textoFinal = texto.toString();
        System.out.println(textoFinal);

    }

}
