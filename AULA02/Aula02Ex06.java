package Aula02;

import java.util.Scanner;

/* 6. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. 
 * Calcular e exibir o valor correspondente em Reais (R$).
 */

public class Aula02Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double dolar, qtde, real;
		
		System.out.printf("Informe a cotacao do Dolar: ");
		dolar = ler.nextDouble();

		System.out.printf("Informe a quantidade de Dolares: ");
		qtde = ler.nextDouble();

		real = dolar * qtde;
		
		System.out.printf("%.2f Dolares a uma cotacao de %.2f equivale a %.2f em Reais\n", qtde, dolar, real);
		
		ler.close();

	}

}
