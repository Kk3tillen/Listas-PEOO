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

public class Q12 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int [][] valores = {{50, 43}, {10, 94}};
		int resultado = maiorValor(valores);
		System.out.println("maior valor: " + resultado);
	}

	static int maiorValor(int [][] valores) {
		int maior = valores[0][0];

		for(int i = 0; i < valores.length; i++) {
			for(int j = 0; j < valores[i].length; j++) {
				if (valores[i][j] > maior) {
					maior = valores[i][j];

				}
			}
		}
		return maior;
	}
}