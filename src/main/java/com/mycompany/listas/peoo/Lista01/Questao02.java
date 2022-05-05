package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*
	Autora: K�zia Ketillen Santos Lima
	data: 15/11/21
	breve explica��o: O us�ario ir� digitar um n�mero e ser� mostrado na tela o seu n�mero sucessor e 
	antecessor.
*/
public class Questao02 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = leia.nextInt();
		
		System.out.println("Seu sucessor �: " + (n + 1));
		System.out.println("Seu antecessor �: " + (n - 1));
	}
}
