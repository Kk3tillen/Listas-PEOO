package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*
	Autora: K�zia Ketillen Santos Lima
	data: 15/11/21
	breve explica��o: Ser� lido dois numeros digitados pelo usuario e esses n�meros ser�o somados e 
	o resultado ser� apresentado na tela
*/

public class Questao04 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int n1 = leia.nextInt();
		System.out.println("Digite outro n�mero: ");
		int n2 = leia.nextInt();
		System.out.println("A soma �: " + (n1+n2));
	}
}