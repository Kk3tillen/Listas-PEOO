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

public class Q09 {

	public static void main(String[] args) { 
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		double numero = leia.nextDouble();

		double [] numeros = {1.6, 3.17, 4.0, 4.5, 1.2};
		boolean encontrou = encontrouNoVetor(numero, numeros);
		System.out.println(encontrou);
	}

	static boolean encontrouNoVetor(double numero, double [] numeros) {
		for(int i = 0; i < numeros.length ; i++) {
			if(numeros[i] == numero) {
				return true;
			}
		}
		return false;
	}
}