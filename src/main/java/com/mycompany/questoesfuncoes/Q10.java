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

public class Q10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		double numero = leia.nextDouble();

		double [] numeros = {1.6, 3.17, 4.0, 4.5, 1.2};
		int posicao = posicaoNoVetor(numero, numeros);
		System.out.println("posição:" + posicao);
	}

	static int posicaoNoVetor (double numero, double [] numeros) {
		for(int i = 0; i < numeros.length ; i++) {
			if(numeros[i] == numero) {
				return i;
			}
		}
		return -1;
	}
}