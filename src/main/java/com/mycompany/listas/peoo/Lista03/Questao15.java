package com.mycompany.listas.peoo.Lista03;

import java.util.Random;
import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {

		Random gerador = new Random();
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe um numero:");
		int numDigitado = leia.nextInt();
		int numAleatorio = gerador.nextInt(1000);


		while (numAleatorio != numDigitado) {


			if (numAleatorio > numDigitado) {
				System.out.println("O n�mero que voc� escolheu � menor do que o n�mero sorteado");
			} else {
				System.out.println("O n�mero que voc� escolheu � maior do que o n�mero sorteado");
			}

			System.out.format( "Se deseja continuar o jogo?%n sim: Digite 1.%n n�o: digite qualquer outro numero.%n");
			numDigitado = leia.nextInt();

			if (numDigitado == 1) {
				System.out.println("Fim de jogo! Voc� n�o conseguiu acertar o n�mero.");
				break;
			} else {
				System.out.println("Informe outro numero:");
				numDigitado = leia.nextInt();
			}	
		}
		if (numAleatorio == numDigitado) {
			System.out.println("Parab�ns, Voc� acertou o n�mero!!!");
		}
	}
}
