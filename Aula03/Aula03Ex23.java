package Aula03;

import java.util.Scanner;

/* 23. Faça um algoritmo que leia os valores A, B, C 
 * e imprima na tela se a soma de A + B é menor que C.
 */

public class Aula03Ex23 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double a, b, c,soma;
		
		System.out.printf("Digite o valor de A: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor de B: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor de C: ");
		c = ler.nextDouble();
		
		soma= a + b;
		
		if(c < soma) {
			System.out.printf("A soma de A + B e maior que C");
		}else {
			System.out.printf("A soma de A + B e menor que C");
		}
		
		ler.close();
	}

}
