package Aula02;

import java.util.Scanner;

//2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.

public class Aula02Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int aresta, area;
		
		System.out.printf("Informe o valor da aresta: ");
		aresta = ler.nextInt();

		area = aresta * aresta;
		
		System.out.printf("A area de um quadrado com aresta de %dcm e: %dcm\n", aresta, area);
		
		ler.close();

	}

}
