package com.mycompany.listas.peoo.Lista03;

import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 0;
		double valorTotal = 0;
		int qnt = 0;
		
		do {
			System.out.println("Digite o numero do que se deja pedir caso contrario, digite -1: ");
			num = leia.nextInt();
			
			if (num != -1) {
			System.out.println("informe a quantidade: ");
			qnt = leia.nextInt();
			}
			
			switch (num) {
			case 100 :
				valorTotal += 1.10 * qnt;
				break;
			case 101 :
				valorTotal += 1.30 * qnt;
				break;
			case 102 :
				valorTotal += 1.50 * qnt;
				break;
			case 103 :
				valorTotal += 1.10 * qnt;
				break;
			case 104 :
				valorTotal += 1.30 * qnt;
				break;
			case 105 :
				valorTotal += 1.00 * qnt;
				break;
			}
		
		} while (num != -1);
		System.out.println("O valor a ser pago � de " + valorTotal);
	}

}
