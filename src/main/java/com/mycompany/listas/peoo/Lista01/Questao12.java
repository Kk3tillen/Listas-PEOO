package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*
	Autora: K�zia Ketillen Santos Lima
	data: 16/11/21
	breve expli��o: O programa l� um valor em Euro e converte o mesmo para Real. 
 */
public class Questao12 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite a quantidade de Euros gastos: ");
		double euros = leia.nextInt();
		
		final double VALOR_REAL = 4.32; 
		double reais = euros * VALOR_REAL;
		System.out.printf("Sua fatura ser� de: %.2f", reais);
	}
}