/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questoesfuncoes;

/**
 *
 * @author kezia
 */

public class Q11 {

	public static void main(String[] args) {
		String [][] matriz = {{"a", "b"},{"c", "d"}};
		imprimirMatriz(matriz);
	}

	static void imprimirMatriz (String [][] x) {
		int i = 0;
		int j = 0;
		while (i < x.length) {
			while (j < x[i].length) {
				System.out.print(x[i][j] + " ");
				j++;
			}
			j = 0;
			System.out.println();
			i++;
		}
	}
}