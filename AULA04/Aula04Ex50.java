package Aula04;

import java.util.Scanner;

/* 50. Elabore um programa que apresente os n�meros pares maiores que 10 no 
 * intervalo fechado [A, B]. Sendo que A e B ser�o n�meros inteiros escolhidos 
 * pelo usu�rio. Um n�mero � par quando este satisfaz a seguinte condi��o: 
 * (N�MERO mod 2 = 0)
 */

public class Aula04Ex50 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int A, B;
		
		System.out.printf("Insira o numero inicial: ");
		A = ler.nextInt();
		System.out.printf("Insira o numero final: ");
		B = ler.nextInt();
		
		while(B <= A) {
			
			System.out.printf("O numero final deve ser maior que o inicial: ");
			B = ler.nextInt();
			
		}
		
		System.out.printf("Os numeros pares inteiros maiores que 10 entre %d e %d s�o:\n", A, B);
		
		for(int x = A; x <= B; x++) {
			
			if(x > 10 && (x % 2) == 0) {
				
				System.out.printf("%d\n", x);
			
			}
		}

	}
}
