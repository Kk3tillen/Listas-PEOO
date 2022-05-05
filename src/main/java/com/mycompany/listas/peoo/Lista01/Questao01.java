
package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;

/*
	Autora: Kezia Ketillen Santos Lima
	Data: 15/11/21
	breve explica��o: O us�ario ir� digitar tr�s n�meros, ser� feita uma soma dos valores e o resultado ser� dividido pela quantidade de n�meros, ou seja, dividido por 3. 
 */
public class Questao01 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int number1 = leia.nextInt();
		System.out.println("Digite outro numero: ");
		int number2 = leia.nextInt();
		System.out.println("Digite mais um numero: ");
		int number3 = leia.nextInt();
		
		int media = (number1 + number2 + number3)/3; 
		System.out.println("A média dos numeros é: " + media);
	}
}