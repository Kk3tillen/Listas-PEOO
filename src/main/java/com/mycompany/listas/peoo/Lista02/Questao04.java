package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
    	
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = leia.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = leia.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int n3 = leia.nextInt();

        if (n1 <= n2 && n2 <= n3) {
            System.out.println(n1 + "-" + n2 + "-" + n3);
        } else if (n1 <= n3 && n3 <= n2) {
            System.out.println(n1 + "-" + n3 + "-" + n2);
        } else if (n2 <= n1 && n1 <= n3) {
            System.out.println(n2 + "-" + n1 + "-" + n3);
        } else if (n2 <= n3) {
            System.out.println(n2 + "-" + n3 + "-" + n1);
        } else if (n1 <= n2) {
            System.out.println(n3 + "-" + n1 + "-" + n2);
        } else {
            System.out.println(n3 + "-" + n2 + "-" + n1);
        }
    }
}
