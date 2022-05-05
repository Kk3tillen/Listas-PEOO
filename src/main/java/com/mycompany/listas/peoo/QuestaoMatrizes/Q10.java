package com.mycompany.listas.peoo.QuestaoMatrizes;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double maior = 0;
		double soma = 0;
		double mult = 1;
		int negativos = 0;
		double [][] valores = new double[5][7];

		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++ ) {
				System.out.println("Informe um n�mero: ");
				valores[i][j] = leia.nextDouble();
				if (valores[i][j] != 0) {
					mult *= valores[i][j];
					if (valores[i][j] < 0) negativos ++;
				} 
			}
		}


		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++ ) {
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++ ) {
				if (valores[i][j] > maior) {
					maior = valores[i][j];
				}
			}
			System.out.println("maior numero da linha " + i + ":");
			System.out.println(maior);
			maior = 0;
		}

		for (int i = 0; i < valores[1].length; i++) {
			for (int j = 0; j < valores.length; j++ ) {
				soma += valores[j][i];

				if (valores[j][i] > maior) {
					maior = valores[j][i];
				}
			}
			System.out.println("maior numero da coluna " + i + ":");
			System.out.println(maior);
			maior = 0;
			System.out.println("media da coluna " + i + ":");
			System.out.println(soma / valores.length);
			soma = 0;
		}
		System.out.println("Multiplica��o dos valores:");
		System.out.println(mult);
		System.out.println("quantidade de numeros negativos: ");
		System.out.println(negativos);
	}


}
