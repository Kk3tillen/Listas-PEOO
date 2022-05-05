package com.mycompany.listas.peoo.Lista03;

public class Questao13 {

	public static void main(String[] args) {
		double ze = 1.10;
		double chico = 1.50;
		int i= 0;

		while (chico >= ze) {
			ze += 0.05;
			chico += 0.03;
			i++;
		}

		System.out.println((i+1) + " anos");

	}
}
