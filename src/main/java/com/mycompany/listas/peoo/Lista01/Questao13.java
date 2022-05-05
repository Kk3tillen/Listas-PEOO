package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*
 	Autora: K�zia Ketillen Santos Lima
	data: 16/11/21
	breve expli��o: O programa solicita a um aluno as seguintes informa��es: a quantidade de coxinhas, past�is e refrigerantes
	comprados por ele na cantina do IFRN e ao fim diz quantos reais foram gastos.
*/
public class Questao13 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantidade de coxinhas compradas: ");
		int qntCo = leia.nextInt();
		System.out.println("Digite a quantidade de past�is comprados: ");
		int pasteis = leia.nextInt();
		System.out.println("Digite a quantidade de refrigerantes comprados: ");
		int refri = leia.nextInt();
		
		double salgados = ((qntCo * 1.75) + (pasteis * 1.50) + (refri * 2.50));
		double valorReferente = ((salgados*5)/100);
		System.out.println("O valor total a ser pago pelo lanche � de R1$" + salgados);
		System.out.println("O valor referente a 5% sobre o valor do lanche: " + valorReferente);
	}
}
