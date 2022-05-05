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

public class Q02 {

	public static void main(String[] args) {

		Scanner leia =new Scanner(System.in);
		System.out.println("Informe o raio do círculo:");
		double raio = leia.nextDouble();

		double resultado = perimetro(raio);
		System.out.println("O perimêtro do círculo é:" + resultado);
	}

	static double perimetro(double raio) {
		return 2 * 3.14 * raio;
	}
}