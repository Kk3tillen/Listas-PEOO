package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.printf("CODIGO	CAMPUS %nSC	IFRN/Santa Cruz %nNC	IFRN/Nova Cruz %nCNAT	IFRN/Natal Centra %nCANG	IFRN/Canguaretama %nJC	IFRN/Jo�o C�mara %n");
		System.out.println("Informe o codigo do campus:");
		String cod = leia.next();
		String maius = cod.toUpperCase();
		
		switch (maius) {
			case "SC": 
				System.out.println("IFRN/Santa Cruz");
				break;
			case "NC":
				System.out.println("IFRN/Nova Cruz");
				break;
			case "CNAT":
				System.out.println("IFRN/Natal Central");
				break;
			case "CANG":
				System.out.println("IFRN/Canguaretama");
				break;
			case "JC":
				System.out.println("IFRN/Jo�o C�mara");
				break;
			default:
				System.out.println("Campus inexistente");
		}
	}
}