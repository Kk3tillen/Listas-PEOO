package com.mycompany.listas.peoo.Lista01;

/*  	
 	Autora: K�zia Ketillen Santos Lima
	data: 20/11/21
	breve expli��o: � lido um valor inteiro correspondente � idade de uma pessoa em dias e lhe � informado em anos, meses e dias.
*/
public class Questao23 {

	public static void main(String[] args) {
		System.out.println("Informe o quantidade de dias voc� j� viveu: ");
		int idadeD = new java.util.Scanner(System.in).nextInt(); //aqui eu estou importando o Scanner, declarando e j� lendo a informa��o do teclado.
		
		int anos = idadeD / 356; 
		System.out.println(anos + "ano(s)");
	
		int mes = (idadeD % 365) / 30;
		System.out.println(mes + "mes(es)");
		
		int dias =(idadeD % 365) % 30;
		System.out.println( dias +" dias");
	}
}
