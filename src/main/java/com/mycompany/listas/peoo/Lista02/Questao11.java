package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("C�digo	Item Pre�o	unit�rio");
		System.out.println("200	Chuteira 	R$ 159,99");
		System.out.println("301	Mei�o		R$14,99");
		System.out.println("102	Camiseta	R$ 59,99");
		System.out.println("403	Cal��o 		R$ 29,99");

		System.out.println("Digite o c�digo do produto:");
		int cod = leia.nextInt();
		System.out.println("Digite a quantidade de produtos:");
		int qntProdutos = leia.nextInt();

		switch (cod) {
		
			case 200:
				System.out.println("O valor da sua compra � de: " + 159.99 * qntProdutos );
				break;
			case 301:
				System.out.println("O valor da sua compra � de: " + 14.99 * qntProdutos);
				break;
			case 102:
				System.out.println ("O valor da sua compra � de: " + 59.99 * qntProdutos);
				break;
			case 403:
				System.out.println("O valor da sua compra � de: " + 29.99 * qntProdutos);
				break;
		}
	}
}