package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		
		System.out.println("Digite um numero de 1 a 7");
		Scanner leia = new Scanner(System.in);
		int n = leia.nextInt();
		
		switch (n) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2: 
				System.out.println("Segunda-Feira");
				break;
			case 3:  
				System.out.println("Terça-Feira");
				break;
			case 4:
				System.out.println("Quarta-Feira");
				break;
			case 5:
				System.out.println("Quinta-Feira");
				break;
			case 6:
				System.out.println("Sexta-Feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
		}
	}
}
