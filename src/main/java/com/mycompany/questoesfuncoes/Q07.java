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

public class Q07
{
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		char[] imprimir = new char[4];

		for(int i = 0; i < imprimir.length; i++){
			System.out.printf("Digite uma letra: \n");
			imprimir[i] = leia.next().charAt(0);
		}
		elementoC(imprimir);
	}

	static void elementoC(char imprimir[]){

		for(int i = 0; i < imprimir.length; i++){
			System.out.print(imprimir[i] + " ");
		}
		System.out.println();
	}
} 