package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao08 {

		public static void main(String[] args) {

			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o seu nome: ");
			String nome = leia.nextLine();
			System.out.println("Informe a quantidade de dias que deseja passar no nosso hotel: ");
			int dias = leia.nextInt();
			
			final double VALOR_DIARIA = 130.00;
			double diarias = VALOR_DIARIA  * dias;
			double total = 0;
			
			if (dias > 4 && dias < 7) {
				total = VALOR_DIARIA * 7.5 / 100 + diarias;
				System.out.printf("Ol�, %s O valor da hospedagem � de: R$ %.2f", nome, total);
			} else if (dias > 7) {
				total = VALOR_DIARIA * 5 / 100 + diarias;
				System.out.printf("Ol�, %s O valor da hospedagem � de: R$ %.2f", nome, total);
			} else if (dias == 2 && dias == 3) {
				total = VALOR_DIARIA * 10 / 100 + diarias;
				System.out.printf("Ol�, %s O valor da hospedagem � de: R$ %.2f", nome, total);
			} else {
				total = VALOR_DIARIA * 15 / 100 + diarias;
				System.out.printf("Ol�, %s! O valor da hospedagem � de: R$ %.2f\s" ,nome, total);
			}
		}
}