package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao02 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um numero:");
		double n = leia.nextDouble();
		
		if (n > 0 && n < 100) {
			System.out.println("Voc� digitou um n�mero entre 0 e 100.");
		} else {
			System.out.println("Voc� digitou um n�mero fora do intervalo entre 0 e 100");
		}
	}
}