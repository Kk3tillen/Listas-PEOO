package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a sua quantidade de faltas");
		int faltas = leia.nextInt();
		System.out.println("Digite a nota 1:");
		double n1 = leia.nextDouble();
		System.out.println("Digite a nota 2:");
		double n2 = leia.nextDouble();
		System.out.println("Digite a nota 3:");
		double n3 = leia.nextDouble();


		final int QNT_NOTAS = 3;
		double media = (n1 + n2 + n3) / QNT_NOTAS;


		if (faltas > 5 || media < 3) {
			System.out.println("Reprovado");
		} else if (media >= 7) {
			System.out.println("Aprovado");	
		} else {
			System.out.println("Recupera��o");
			System.out.println("Informe a sua nota na recupera��o: ");
			double notaRe = leia.nextDouble();
			double re = (n1 + n2 + n3 + notaRe)/ 4;
			if (re>= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		}
	}
}