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

public class Q08 {

	static void inverso(String x[]) {

		for (int i = x.length - 1; i >= 0 ; i--) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String m[] = new String[10];

		for (int i = 0; i < m.length; i++) {
			System.out.println("Digite valores: ");
			m[i] = leia.nextLine();
		}

		inverso(m);
	}
}