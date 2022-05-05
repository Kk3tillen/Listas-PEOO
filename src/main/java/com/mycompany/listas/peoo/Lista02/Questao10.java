package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int resp = 0;
		final String S = "sim";
		String respostas;
	
		System.out.println("Responda as seguntes perguntas sobre o assasinato: ");
		System.out.println("Telefonou para a v�tima? ");
		respostas = leia.next(); 
		if (respostas.equalsIgnoreCase(S)) {
			resp++;
		}
		System.out.println("Esteve no local do crime? ");
		respostas = leia.next();
		if (respostas.equalsIgnoreCase(S)) {
			resp++;
		}
		System.out.println("Mora perto da v�tima?");
		respostas = leia.next();
		if (respostas.equalsIgnoreCase(S)) {
			resp++;
		}
		System.out.println("Devia para a v�tima? ");
		respostas = leia.next();
		if (respostas.equalsIgnoreCase(S)) {
			resp++;
		}
		System.out.println("J� trabalhou para a v�tima?");
		respostas = leia.next();
		if (respostas.equalsIgnoreCase(S)) {
			resp++;
		}

		if (resp <= 1) {
			System.out.println("Inocente");
		}else if (resp == 2) {
			System.out.println("Suspeito");
		} else if (resp == 3 || resp == 4) {
			System.out.println("C�mplice");
		} else {
			System.out.println("Assasino");
		}
	}
}