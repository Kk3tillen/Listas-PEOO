package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite  a quantida de ma�as compradas:");
		int qntMaca = leia.nextInt();
		double preco = 0;
		final int QUANT_MIN_MACA = 12;
		final double VALOR_1 = 0.30;
		final double VALOR_2 = 0.25;
		
		if (qntMaca < QUANT_MIN_MACA) {
			preco = qntMaca * VALOR_1;
			System.out.format("O valor das ma�as foi de: %.2f", preco);
		} else {
			preco = qntMaca * VALOR_2;
			System.out.format("O valor das ma�as foi de: %.2f", preco);
		}
	}
}
