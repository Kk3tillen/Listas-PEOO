package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*
	Autora: K�zia Ketillen Santos Lima
	data: 15/11/21
	breve expli��o: O programa l� o saldo de uma conta banc�ria e imprima o novo saldo, considerado um reajuste
	de 7,5%.
*/
public class Questao10 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("informe seu saldo: ");
		double saldo = leia.nextDouble();
		
		double reajuste = (saldo * 7.5)/100;
		double novoSaldo = saldo + reajuste;
		System.out.printf("O seu novo saldo com o reajuste é de: %.2f ",  novoSaldo);
	}

}
