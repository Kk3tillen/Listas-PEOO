package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*
  	Autora: K�zia Ketillen Santos Lima
	data: 17/11/21
	breve expli��o: O programa converte um numero em segundos para dias, horas, minutos e segundos.
 */
public class Questao16 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantos anos voc� fuma: ");
		int anosFumando = leia.nextInt();
		System.out.println("Em m�dia, quantos cigarros voc� fuma por dia? ");
		int fumadosDia = leia.nextInt();
		System.out.println("Qual o valor de uma carteira com 20 cigarros?");
		double preco = leia.nextDouble();
		
		double valorTotal = 0;
		valorTotal = (((anosFumando * 365) * fumadosDia) / 20) * preco;
		System.out.print("O valor gasto durante os " + anosFumando + " anos � de ");
		System.out.printf("R$ %.2f", valorTotal);
	}
}