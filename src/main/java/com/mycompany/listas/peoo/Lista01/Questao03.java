package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*
 	Autora: K�zia Ketillen Santos Lima
	data: 15/11/21
	breve explica��o: Ser� lido um n�mero digitado pelo usuario e ser� apresentado na tela o valor do n�mero digitado a 
	6� pot�ncia e o valor da sua raiz quadrada.
*/
public class Questao03 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n1 = leia.nextInt();
		
		double potencia = Math.pow(n1 , 5);
		double raiz = Math.sqrt(n1);
		System.out.println("Seu n�mero elevado a quinta pot�ncia: " + potencia);
		System.out.println("Sua raiz raiz quadrada: " + raiz);
	}
}
