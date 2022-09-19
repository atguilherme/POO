package Aula02;

import java.util.Scanner;

/* Entrar com 2 valores, realizar a soma deles e exibir o resultado */

public class Aula02Exemplo01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();

		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		soma = a + b;
		
		System.out.printf("A soma de %d + %d e: %d", a, b, soma);
				
		ler.close();

	}

}
