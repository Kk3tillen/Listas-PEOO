package com.mycompany.listas.peoo.QuestoesVetores;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {

		int[][] m = new int[3][3];
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Digite um n�mero:");
				m[i][j] = leia.nextInt();
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("A diagonal principal �:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(i == j) {
					System.out.print(m[i][j] + " ");
				}
			}
		}
	}
}