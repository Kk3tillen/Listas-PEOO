package com.mycompany.listas.peoo.Lista03;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor do dividendo: ");
		int dividendo = leia.nextInt();
		System.out.println("Digite o valor do divisor: ");
		int divisor = leia.nextInt();
		int contador = 0;

		while (dividendo >= divisor ) {
			dividendo -= divisor;
			contador++;
		}

		System.out.println("resto= " + dividendo);
		System.out.println("quoc= " + contador);
	}
}