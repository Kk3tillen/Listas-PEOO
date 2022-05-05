package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*
  	Autora: K�zia Ketillen Santos Lima
	data: 19/11/21
	breve expli��o: O programa informa a �rea e o volume de um cilindro.
 */
public class Questao17 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor do raio do cilindo:");
		double r = leia.nextDouble();
		System.out.println("Digite o valor da altura do cilindro");
		double h = leia.nextDouble();
		final double PI = 3.14; 
		double volume = PI * r*r * h;
		double area = (2 * PI * r * h) + (2 * PI * r * r);
		System.out.printf("O volume do cilindro � de: %.2f.\ne sua �rea total � de: %.2f.", volume, area); 
	}
}
