package com.mycompany.listas.peoo.Lista03;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int contadorD = 0;
		int contadorF = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um numero:");
			int numero = leia.nextInt();
			
			if (numero >= 0 && numero <= 100) {
				contadorD +=1;
			} else {
				contadorF += 1;
			}
		
		}
		System.out.println("A quantidade de valores que est� no intervalo � de: " + contadorD);
		System.out.println("A quantidade de valores que est� fora do intervalo � de: " + contadorF);
	}
}