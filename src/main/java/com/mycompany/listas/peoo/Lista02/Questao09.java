package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a velociadade m�xima: ");
		double velocidadeMax = leia.nextDouble();
		System.out.println("Informe a velocidade que voc� estava dirigindo: ");
		double velocidade = leia.nextDouble();
		
		double velUltrapassada = (velocidade <= velocidadeMax )? 0 : velocidade - velocidadeMax;
		
		if (velUltrapassada == 0) {
			System.out.println("Voc� n�o recebeu nenhuma multa.");
		} else if ( velUltrapassada <= 10  ) {
			System.out.println("Sua multa � de R$ 50,00");
		} else if (velUltrapassada >= 11 && velUltrapassada <= 30 ) {
			System.out.println("Sua multa � de R$ 100,00");
		} else {
			System.out.println("Sua multa � de R$ 200,00");
		}
	}
}
