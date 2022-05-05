package com.mycompany.listas.peoo.QuestaoMatrizes;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		final int QNT_NOTAS = 3;
		final int QNT_ALUNOS = 3;
		double mediaFinal = 0;
		double mediaProva1 = 0;
		double mediaProva2= 0;
		double trabalho = 0;

		double [][] notas = new double[QNT_ALUNOS][QNT_NOTAS];


		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Digite a nota " + (j+1) + " para o aluno " + (i+1) + ":");
				notas[i][j] = leia.nextDouble();
			}
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.println("prova 1: "+ notas[i][0]+ " prova 2: " + notas[i][1] + " trabalho: " + notas[i][2]);
			mediaFinal = notas[i][0] * 0.4 + notas[i][1] * 0.4 + notas[i][2] * 0.2;
			System.out.println("M�dia Final:" + mediaFinal);

			mediaProva1 += notas[i][0];
			mediaProva2 += notas[i][1];
			trabalho += notas[i][2];

			if(mediaFinal >= 9.0) {
				System.out.println("conceito A");
			} else if (mediaFinal >= 7.5) {
				System.out.println("conceito B");
			} else if (mediaFinal >= 6.0) {
				System.out.println("conceito C");
			} else if (mediaFinal >= 3.0) {
				System.out.println("conceito R (prova de recupera��o)");
			} else {
				System.out.println("conceito D");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println( String.format("M�dia prova I: %.2f", mediaProva1/QNT_ALUNOS ));
		System.out.println(String.format("M�dia prova I: %.2f", mediaProva2/QNT_ALUNOS ));
		System.out.println(String.format("M�dia Trabalho: %.2f", trabalho/QNT_ALUNOS ));

	}
}