package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*
	Autora: K�zia Ketillen Santos Lima
	data: 15/11/21
	breve explica��o: O programa que ler uma temperatura em graus Celsius e apresente-a convertida em graus
	Fahrenheit.
 */
public class Questao08 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Celsius: ");
		double tpCelsius = leia.nextInt();
		
		double F = (9 * tpCelsius + 160) / 5;
		System.out.println("A temperatura em Fahrenheit � de "+ F + "�F");
	}
}
