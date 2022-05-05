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

public class Q14 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a quantidade de linhas do vetor:");
		int linhas = leia.nextInt(); 
		System.out.println("Informe a quantidade de colunas do vetor:");
		int colunas = leia.nextInt();

		double[][] nums = new double[linhas][colunas];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				System.out.println("Informe um valor para a matriz:");
				nums[i][j] = leia.nextDouble();
			}
		}

		System.out.println("Informe a linha de 1 a " + (linhas) + " que deseja pegar os valores: ");
		int linha = leia.nextInt();

		double [] valores = getLinhaMatriz(nums, linha); 
		for (double valor : valores) {
			System.out.print(valor + " ");
		}
	}

	static double [] getLinhaMatriz (double matriz[][], int linha) {
		return matriz[linha-1];
	}
}
