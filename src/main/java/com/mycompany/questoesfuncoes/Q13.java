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

public class Q13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int [][] numeros = {{1, 2, 3, 4},{5, 6 ,7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int soma = somaAcimaDaDiagonal(numeros);
		System.out.println("Soma dos numeros acima da diagonal: " + soma);
	}

	static int somaAcimaDaDiagonal (int [][] x ) {
		int soma = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (j > i) {
					soma += x[i][j];
				}
			}
		}
		
		return soma;
	}
}