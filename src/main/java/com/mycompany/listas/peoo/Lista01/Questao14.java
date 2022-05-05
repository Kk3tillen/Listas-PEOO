package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*
Autora: K�zia Ketillen Santos Lima
data: 16/11/21
breve expli��o: O programa calcula e mostra a �rea de um tri�ngulo.
*/
public class Questao14 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor da base do tri�ngulo: ");
		double base = leia.nextDouble();
		System.out.println("Digite a altura: ");
		double h = leia.nextDouble();
		
		double area = (base * h / 2);
		System.out.println("O valor da �rea do tri�ngulo � de: " + area + "cm�");
	}
}