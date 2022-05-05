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

public class Q04
{
	static void divisoresNum(int numero) {
		for(int i = 1; i <= numero; i++) {
			if(numero % i == 0) 
				System.out.printf("%d\n", i);
		}
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.printf("Digite um número: ");
		int numero = leia.nextInt();
		System.out.println("Os divisores são: ");
		divisoresNum(numero); 
	}
} 
