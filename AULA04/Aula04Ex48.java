package Aula04;

import java.util.Scanner;

/* 48. Crie um programa em que o usu�rio entre com um n�mero inteiro qualquer, 
 * e o programa imprima os 20 n�meros subsequentes ao que foi digitado pelo usu�rio
 */

public class Aula04Ex48 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Insira um numero: ");
		int n = ler.nextInt();
		
		for(int x = 1; x < 21; x++) {
			
			System.out.printf("%d\n", n+x);
			
		}
		
	}

}
