package com.mycompany.listas.peoo.Lista03;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int qntNumeros = 1;
		int acm = 0;
		double media = 0; 
		System.out.println("Digite um numero: ");
		int num = leia.nextInt();
		
		while (num != 9999) {
			acm += num;
			System.out.println("Informe um numero: ");
			num = leia.nextInt();
			if (num == 9999) {
				break;
			} else {
			qntNumeros++;
			}
		}
		media = (double) acm / qntNumeros;
		System.out.println("A media �: " + media);
		System.out.println("A soma os numeros � " + acm);
	}
}