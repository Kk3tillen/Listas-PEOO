package com.mycompany.listas.peoo.Lista03;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n1 = leia.nextInt();
		System.out.println("Digite outro numero: ");
		int n2 = leia.nextInt();
		int soma = 0;
		
		for (int i = 0; i < n2; i ++) {
			soma += n1;	
		}
		
		System.out.println("O produto �: " + soma);
	}

}
