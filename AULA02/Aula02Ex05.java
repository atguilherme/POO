package Aula02;

import java.util.Scanner;

/*5. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular
e exibir sua temperatura equivalente em Fahrenheit.*/


public class Aula02Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double gcelsius, gfahrenheit;
		
		System.out.printf("Informe a temperatura em graus Celsius: ");
		gcelsius = ler.nextDouble();

		gfahrenheit = (gcelsius * 1.8) + 32;
		
		System.out.printf("%.1f Celsius equivale a %.1f em fahrenheit\n", gcelsius, gfahrenheit);

		ler.close();

	}

}
