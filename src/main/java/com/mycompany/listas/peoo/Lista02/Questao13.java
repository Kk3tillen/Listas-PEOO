package com.mycompany.listas.peoo.Lista02;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);

		System.out.println("IDADE	CATEGORIA");
		System.out.println("De 05 a 10	Infantil");
		System.out.println("De 11 a 15	Juvenil");
		System.out.println("De 16 a 20	J�nior");
		System.out.println("De 21 a 25	Profissional");

		System.out.println("Informe o seu nome: ");
		String nome = leia.nextLine();
		System.out.println("Informe sua idade: ");
		int idade = leia.nextInt();

		if(idade >= 5 && idade <= 10) {
			System.out.println("Categoria: Infantil");
		} else if (idade >= 11 && idade <= 15 ) {
			System.out.println("Categoria: Juvenil");
		} else if (idade >= 16 && idade <= 20) {
			System.out.println("Categoria: J�nior");
		} else if (idade >= 21 && idade <= 25) {
			System.out.println("Categoria: Profissional");
		} else {
			System.out.println("Para participar do club � necessario que a idade esteja inclusa em uma das categorias.");
		}
	}
}
