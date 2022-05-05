package com.mycompany.listas.peoo.Lista03;

import java.util.Random;
public class Questao14 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int num = 0;
		for (int i = 0; i < 20; i++) {
			num = gerador.nextInt(3001);


			if (num % 11 == 5) {
				System.out.println(num); }
		}
	}
}

