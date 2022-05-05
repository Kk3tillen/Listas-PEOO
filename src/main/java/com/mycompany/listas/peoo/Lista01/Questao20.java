package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*  	
 	Autora: K�zia Ketillen Santos Lima
	data: 20/11/21
	breve expli��o: � lido o valor de um produto e a quantidade de parcelas desejadas pelo cliente. Em
	seguida, o programa calcula o valor das parcelas e o valor da multa de 2% sobre uma parcela, caso o cliente
	esque�a-se de pagar a mesma.
*/
public class Questao20 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o valor do seu produto: ");
		double valor = leia.nextDouble();
		System.out.println("Digite a quantidade de parcelas: ");
		int parcelas = leia.nextInt();
		
		double valorP = valor / parcelas; 
		double juros = (valorP * 0.02) + valorP;
		System.out.printf("O valor das parcelas ser� de: %.2f\n", valorP);
		System.out.printf("O valor das parcelas caso n�o ocorra o pagamento na data prevista: %.2f\n", juros);	
	}
}
