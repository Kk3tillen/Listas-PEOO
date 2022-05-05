package com.mycompany.listas.peoo.QuestaoMatrizes;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		char [][] caracters = new char[3][3];

		for (int i = 0; i < caracters.length; i++) {
			for (int j = 0; j < caracters[i].length; j++) {
				System.out.println("Informe um caracter: ");
				caracters[i][j] = leia.next().charAt(0);
			}
		}

		for (int i = caracters.length-1; i >= 0; i--) {
			for (int j = caracters[i].length-1; j >= 0; j--) {
				System.out.print(caracters[i][j] + " ");
			}

			System.out.println();
		}
	}
}
