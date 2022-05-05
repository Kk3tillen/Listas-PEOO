package com.mycompany.listas.peoo.QuestoesVetores;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double valor = leia.nextDouble();
		boolean encontrar = false;
		int linha = 0;
		int coluna = 0;
		double[][] valores = {{2.0,5.1,6.9}, {5.8, 9.1, 3.4 }, {6.1, 2.4, 4.4}};

		for(int i = 0; i < valores.length; i++ ) {
			for(int j = 0; j < valores.length; j++) {
				if (valor == valores[i][j]) {
					encontrar = true;
					linha = i;
					coluna = j;
					break;
				}
			} 
		}
		
		if (encontrar == true) {
			System.out.println("Posi��es: [" + linha + "][" + coluna + "]");
		} else {
			System.out.println("O valor n�o foi encontrado.");
		}
	}
}
