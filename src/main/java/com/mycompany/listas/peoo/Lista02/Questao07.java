package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("informe o valor do seu sal�rio: ");
		double salario = leia.nextDouble();
		
		double aumento = 0;
		
		if (salario <= 1500.00 && salario < 1750.00) {
			aumento = salario * 12 / 100 + salario; 
			System.out.println(aumento);
		} else if (salario <= 1750.00 && salario < 2000.00) {
			aumento = salario * 10/ 100 + salario;
			System.out.println(aumento);
		} else if (salario <= 2000.00 && salario < 3000.00) {
			aumento = salario* 7.5/ 100 + salario;
			System.out.println(aumento);
		} else if (salario > 3000.00){
			aumento = salario * 5/ 100 + salario;
			System.out.println(aumento);
		} else {
			aumento = salario * 15 / 100 + salario;
		}
	}

}
