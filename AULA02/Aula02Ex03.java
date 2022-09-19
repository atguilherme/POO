package Aula02;

import java.util.Scanner;

//3. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

public class Aula02Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.printf("Informe o valor da base: ");
		base = ler.nextInt();

		System.out.printf("Informe o valor da altura: ");
		altura = ler.nextInt();
		
		area = (base * altura) / 2;
		
		System.out.printf("A area de um triangulo com %.2fcm de base por %.2fcm de altura e: %.2fcm\n", base, altura, area);

		ler.close();

	}

}
