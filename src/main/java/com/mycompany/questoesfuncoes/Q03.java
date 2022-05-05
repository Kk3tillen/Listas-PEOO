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

public class Q03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o raio do círculo:");
		double raio = leia.nextDouble();
		double resultado = area(raio);
		System.out.println("Área do círculo" + resultado);
	}

	static double area(double raio) { 
		double quadrado = Math.pow(raio, 2);
		return 3.14 * quadrado;
	}
}