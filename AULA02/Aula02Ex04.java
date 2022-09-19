package Aula02;

import java.util.Scanner;

//4. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

public class Aula02Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2, v3, v4, media;
		
		System.out.printf("Informe o primeiro valor: ");
		v1 = ler.nextInt();

		System.out.printf("Informe o segundo valor: ");
		v2 = ler.nextInt();

		System.out.printf("Informe o terceiro valor: ");
		v3 = ler.nextInt();

		System.out.printf("Informe o quarto valor: ");
		v4 = ler.nextInt();

		media = (v1 + v2 + v3 + v4) / 4;
		
		System.out.printf("A media dos valores %d, %d, %d, %d e: %d\n", v1, v2, v3, v4, media);
		
		ler.close();

	}

}
