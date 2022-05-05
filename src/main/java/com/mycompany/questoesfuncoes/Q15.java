/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questoesfuncoes;


/**
 *
 * @author kezia
 */

public class Q15 {

	public static void main(String[] args) {
		
		String [][] numeros = {{"feliz", "oi", "oi", "oi"},{"oi", "ano","oi", "oi"}, {"oi", "oi","novo", "oi"}, {"oi", "oi","oi", ":)"}};
		String [] vetor  = valoresDaDiagonal(numeros);
		
		for (String valor : vetor) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}

	static String [] valoresDaDiagonal (String [][] x ) {

		String [] valoresDiagonal = new String[x.length];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (j == i) {
					valoresDiagonal[i] = x[i][j];
				}
			}
		}

		return valoresDiagonal;
	}
} 