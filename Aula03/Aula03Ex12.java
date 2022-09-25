package Aula03;

import java.util.Scanner;
/*12. Calcular e exibir a área de um retângulo, a partir dos valores da base e altura
 *  que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”,
 *  caso contrário, exibir a mensagem “Terreno pequeno”.
 */

public class Aula03Ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.printf("Digite o valor da base: ");
		base = ler.nextDouble();
		
		System.out.printf("Digite o valor da altura: ");
		altura = ler.nextDouble();
		
		area = (base * altura);
		
		if (area > 100) {
			System.out.printf("Terreno Grande");
		}else {
			System.out.printf("Terreno Pequeno");
		}
		
		ler.close();

	}
}
