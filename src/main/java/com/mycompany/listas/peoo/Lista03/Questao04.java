package com.mycompany.listas.peoo.Lista03;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("informe um numero:");
		int num = leia.nextInt();
		
		int i = 1;
		while (i <= num) {
			if (num % i == 0  ) {
				System.out.println(i);
			}
			i++;
		}

	}

}
