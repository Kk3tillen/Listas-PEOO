package com.mycompany.listas.peoo.QuestoesVetores;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		final int TAMANHO = 18;
		int posicao = 0;
		int [][] valores = new int[6][6];
		int [] valoresPares = new int[TAMANHO];
		int [] valoresDiagonal = new int[6];

		for(int i = 0; i < valores.length; i++) {
			for(int j = 0; j < valores[i].length; j++) {
				System.out.println("Informe um n�mero:");
				valores[i][j] = leia.nextInt();
			}
		}

		for (int i = 1; i < valores.length; i+= 2) {
			for (int j = 0; j < valores[i].length; j++ ) {
				valoresPares[posicao] = valores[i][j];
				posicao++;
			}
		}
		posicao = 0;
		
		for (int i = 0; i < valores.length; i++) {
			for ( int j = 0; j < valores[i].length; j++) {
				if (i == j) {
					valoresDiagonal[posicao] = valores[i][j];
					posicao++;
				}
			}
		}

		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Valores pares: ");
		for( int par : valoresPares) {
			System.out.print(par + " ");
		}
		
		System.out.println("Valores da diagonal: ");
		for( int diagonal : valoresDiagonal) {
			System.out.print(diagonal + " ");
		}
	}
}
