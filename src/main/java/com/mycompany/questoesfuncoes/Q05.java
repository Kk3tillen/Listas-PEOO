/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questoesfuncoes;

import java.util.Scanner;
/**
 *
 * @author kezia
 */

public class Q05
{
	static boolean resultPrimo(int numero) {

		for(int i = 2; i < numero; i++){
			if(numero % i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		boolean resultado;
		System.out.println("Digite um número:");
		int num = leia.nextInt();

		resultado = resultPrimo(num);

		if(resultado == true){
			System.out.printf("O número primo.\n");
		} else {
			System.out.printf("o número não é primo.\n");
		}
	}
}
