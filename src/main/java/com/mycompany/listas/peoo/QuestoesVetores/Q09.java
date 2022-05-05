package com.mycompany.listas.peoo.QuestoesVetores;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe a quantidade de linhas:");
		int linhas = leia.nextInt();
		System.out.println("Informe a quantidade de colunas:");
		int colunas = leia.nextInt();
		int qntZeros = 0;
		int linhasNulas = 0;
		int colunasNulas = 0;

		int [][] valores = new int [linhas][colunas];

		for(int i = 0; i < valores.length; i++) {
			for(int j = 0; j< valores[i].length; j++) {
				System.out.println("Digite os valores da matriz: ");
				valores[i][j] = leia.nextInt();
			}
		}

		for(int i = 0; i < valores.length; i++) {
			for(int j = 0; j< valores[i].length; j++) {
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
		
		//LINHAS

		for (int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				if (valores[i][j] != 0) {
					break;
				} else {
					qntZeros++;
				}

			} if(qntZeros == 3) {
				linhasNulas++;
			} 
			qntZeros = 0;
		}

		//COLUNAS

		for (int i = 0; i < colunas; i++) {
			for(int j = 0; j < linhas; j++) {
				if (valores[j][i] != 0) {
					break;
				} else {
					qntZeros++;
				}

			} if(qntZeros == 3) {
				colunasNulas++;
			} 
			qntZeros = 0;
		}
		System.out.println("O numero de colunas nulas é " + colunasNulas + " e o numero de linhas nulas é " + linhasNulas);
	}
}

