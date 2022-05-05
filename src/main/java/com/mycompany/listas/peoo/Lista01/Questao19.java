package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*
   	Autora: K�zia Ketillen Santos Lima
	data: 20/11/21
	breve expli��o: No programa � lido um valor em jardas e o mesmo � convertido para metros.
 */
public class Questao19 {

	public static void main(String[] args) {
		Scanner americano = new Scanner(System.in);
		
		System.out.println("Digite o valor em jardas: ");
		double jardas = americano.nextDouble();
		
		double metros = jardas * 0.91;
		System.out.println("O valor das jardas em metros � de: " + metros);
	}
}
