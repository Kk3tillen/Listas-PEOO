package com.mycompany.listas.peoo.Lista01;

import java.util.Scanner;
/*  	
	Autora: K�zia Ketillen Santos Lima
	data: 20/11/21
	breve expli��o: O programa l� os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e
	p2(x2,y2) e calcule a dist�ncia entre eles, mostrando 4 casas decimais ap�s a v�rgula.
*/
public class Questao22 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor correspondente ao ponto X1: ");
		double x1 = leia.nextDouble();
		System.out.println("Digite o valor correspondente ao ponto Y1: ");
		double y1 = leia.nextDouble();
		System.out.println("Digite o valor correspondente a X2: ");
		double x2 = leia.nextDouble();
		System.out.println("Digite o valor correspondente a y2: ");
		double y2 = leia.nextDouble();
		
		double mat = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		System.out.printf("A distancia entre os pontos � de: %.4f\n", Math.pow(mat,1.0/2));
	}
}

