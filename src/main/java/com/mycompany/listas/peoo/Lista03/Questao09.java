package com.mycompany.listas.peoo.Lista03;

public class Questao09 {

	public static void main(String[] args) {
		int soma = 0;
		final int QNT_ENTRE = 873 - 12 - 1;
		
		for( int i = 13; i < 873; i++  ) {
			soma += i;
		}
		int divisao = soma / QNT_ENTRE;
		System.out.println("A m�dia aritimetica dos numeros entre 12 e 873 �: " + divisao);
	}
}
