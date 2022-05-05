package com.mycompany.listas.peoo.Lista03;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe um numero natural: ");
        int n = leia.nextInt();
        long mult = 1;

        for (int i = n; i > 0; i--) {
            mult *= i;
        }

        System.out.println("O resultado de " + n + "!"+ " = " + mult);
    }
}