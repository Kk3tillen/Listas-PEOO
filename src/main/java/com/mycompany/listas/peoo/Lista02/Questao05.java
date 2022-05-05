package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o horario de inicio do jogo:");
		int inicio = leia.nextInt();
		System.out.println("Informe o horario do fim do jogo:");
		int fim = leia.nextInt();
		final int HORAS_DIA = 24;

		if (fim > inicio) {
			System.out.println("O JOGO DUROU " + (HORAS_DIA - ( fim - inicio)) + " HORA(S)");
		} else if (inicio > fim) {
			System.out.println("O JOGO DUROU " + (inicio - fim) + " HORA(S)");
		} else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
	}
}
