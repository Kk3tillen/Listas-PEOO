/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questoesfuncoes;

import java.util.Scanner;

/**
 *
 * @author kezia
 */
public class Q01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double valor1 = leia.nextInt();
        System.out.println("Informe outro número: ");
        double valor2 = leia.nextInt();
        double resultado = soma(valor1, valor2);
        System.out.println(valor1 + " + " + valor2 + " = " + resultado);
        double resultado2 = sub(valor1, valor2);
        System.out.println(valor1 + " - " + valor2 + " = " + resultado2);
        double resultado3 = mult(valor1, valor2);
        System.out.println(valor1 + " * " + valor2 + " = " + resultado3);
        double resultado4 = div(valor1, valor2);
        System.out.println(valor1 + " + " + valor2 + String.format(" = %.2f", resultado4));

    }

    static double soma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    static double mult(double valor1, double valor2) {
        return valor1 * valor2;
    }

    static double div(double valor1, double valor2) {
        return valor1 / valor2;
    }

    static double sub(double valor1, double valor2) {
        return valor1 - valor2;
    }
}
