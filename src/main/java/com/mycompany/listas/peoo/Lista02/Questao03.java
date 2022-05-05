package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao03 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um ano: ");
		int n = leia.nextInt();

		if ((n % 400 == 0) || (n % 4 == 0) && (n % 100 != 0)) {
			System.out.println("O ano informado � bissexto.");
		} else {
			System.out.println("O ano informado n�o � bissexto.");
		}
	}
}
