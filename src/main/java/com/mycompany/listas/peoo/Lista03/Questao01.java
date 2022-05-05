package com.mycompany.listas.peoo.Lista03;

public class Questao01 {

	public static void main(String[] args) {
		int contador = 0;

		for (int i = 1; i <= 500; i++) {
			contador += i;
		}
		System.out.println("a soma dos 500 primeiros no naturais �: " + contador);
	}
}