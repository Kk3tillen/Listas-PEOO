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

public class Q06
{
	static int fatorial(int valor) {
		int i = 0, fat = 1;
		while(i < valor){
			i++;
			fat *= i;
		}

		return fat;
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n, resultado;
		System.out.printf("Digite um número:\n");
		n = leia.nextInt();
		resultado = fatorial (n);
		System.out.printf("O fatorial de !%d = %d.", n, resultado);
	}  
} 