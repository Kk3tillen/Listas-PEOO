package com.mycompany.listas.peoo.QuestoesVetores;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o tamanho da coluna:");
		int colu = leia.nextInt();
		System.out.println("Digite a quantidade de linhas:");
		int linhas = leia.nextInt();

		String [][] x = new String[linhas][colu];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colu; j++) {
				System.out.println("Informe um valor:");
				x[i][j] = leia.next();
			}
		}

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colu; j++) {
				System.out.print(x[i][j] + " ");
			}

			System.out.println();
		}
	}
}
