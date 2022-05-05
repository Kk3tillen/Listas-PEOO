package com.mycompany.listas.peoo.Lista03;

public class Questao18 {

	public static void main(String[] args) {
		int qntPrimo = 0;
		int num = 2;
		int sete = 0;
		int qntDivisores = 0;
		int ving = 0;
		
		int i = 1;
		while (qntPrimo <= 21) {
			qntDivisores = 0;
			i = 1;
			while (i <= num) {
				if (num % i == 0  ) {
					qntDivisores++;
				}
				i++;
			}

			if (qntDivisores == 2) {
				qntPrimo++;
				if (qntPrimo == 7) {
					sete = num;
				} else if (qntPrimo == 21) {
					ving = num;
				}
			}
			num++;
		}
		System.out.println("A diferen�a entre os termos s�o: "+ (sete - ving));
	}

}