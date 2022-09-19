package Aula02;

import java.util.Scanner;

//1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.

public class Aula02Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.printf("Informe o valor da base: ");
		base = ler.nextInt();

		System.out.printf("Informe o valor da altura: ");
		altura = ler.nextInt();
		
		area = base * altura;
		
		System.out.printf("A area de um retangulo com %d de base por %d de altura e %d\n", base, altura, area);


	}
}
