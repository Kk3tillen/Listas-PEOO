package com.mycompany.listas.peoo.Lista03;

import java.util.Scanner;

public class Questao21 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		//M�dia final = [(2 * Nota1) + (3* Nota2) + (4* Nota 3)] / 9;
		double mediaFinal = 0;
		System.out.println("Digite o numero da matricula: ");
		int matricula = leia.nextInt();
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		
		int aprovados = 0;
		int reprovados = 0;

		while (matricula != 9999) {
			System.out.println("Digite a nota 1: ");
			n1 = leia.nextDouble();
			System.out.println("Digite a nota 2: ");
			n2 = leia.nextDouble();
			System.out.println("Digite a nota 3: ");
			n3 = leia.nextDouble();
			mediaFinal = ((2 * n1) + (3* n2) + (4* n3)) / 9;
			System.out.println(matricula);
			System.out.println(mediaFinal);
			if (mediaFinal >= 5) {
				System.out.println("APROVADO");
				aprovados++;
			} else {
				System.out.println("REPROVADO");
				reprovados++;
			}
			System.out.println();
			matricula = leia.nextInt();
		}
		
		System.out.println("A quantidade de aprovados �:" + aprovados);
		System.out.println("A quantidade de reprovados �:" +reprovados);
		System.out.println("Total de alunos:" + aprovados + reprovados);
		
	}
}