package Aula03;

import java.util.Scanner;

/* 28. Escreva um algoritmo que leia três valores inteiros e diferentes e 
 * mostre-os em ordem crescente.
 */

public class Aula03Ex28 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o primeiro numero: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo numero: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro numero: ");
		c = ler.nextInt();
		
		
		if (a < b && b < c) {
			System.out.printf("Ordem Crescente: %d, %d, %d.", a, b, c);
		}else if (a < c && c < b) {
			System.out.printf("Ordem Crescente: %d, %d, %d.", a, c, b);
		}else if (b < a && a < c) {
			System.out.printf("Ordem Crescente: %d, %d, %d.", b, a, c);
		}else if (b < c && c < a) {
			System.out.printf("Ordem Crescente: %d, %d, %d.", b, c, a);
		}else if (c < a && a < b) {
			System.out.printf("Ordem Crescente: %d, %d, %d.", c, a, b);
		}else if (c < b && b < a) {
			System.out.printf("Ordem Crescente: %d, %d, %d.", c, b, a);
		}

		ler.close();

	}

}
