package com.mycompany.listas.peoo.QuestaoMatrizes;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);		

		int[][] matrizA = new int[3][3];
		int[][] matrizB = new int[3][3];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.println("Digite um n�mero para a Matriz A:");
				matrizA[i][j] = leia.nextInt();
			}
		}
		
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.println("Digite um n�mero para a Matriz B:");
				matrizB[i][j] = leia.nextInt();
			}
		}
		
		System.out.println("Matriz A");
		for (int i = 0;i < matrizA.length;i++){
			for (int j = 0; j < matrizA[i].length;j++){
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Matriz B");
		for (int i = 0;i < matrizB.length;i++){
			for (int j = 0;j < matrizB[i].length;j++){
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("A subtra��o das matrizes A e B �:");
		for (int i = 0; i <  matrizB.length;i++){
			for (int j = 0;j <  matrizB[i].length;j++){
				System.out.print(matrizA[i][j]  - matrizB[i][j] + " ");
			}
			System.out.println();
		}
	}
}