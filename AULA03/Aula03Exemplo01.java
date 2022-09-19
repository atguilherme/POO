package Aula03;

import java.util.Scanner;

/* Fazer um programa que irá receber duas notas e irá calcular a média e verificar
 * se o aluno está aprovado ou reprovado. Para estar aprovado é necessário obter 
 * uma média igual ou superior a 5, caso contrário o aluno estará reprovado.
 */

public class Aula03Exemplo01 {

	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, m;
		
		System.out.printf("Digite a nota da P1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite a nota da P2: ");
		p2 = ler.nextDouble();
		
		m = (p1 + p2) / 2;
		
		if (m >= 5) {
			System.out.printf("a sua media foi %.1f. Portanto voce esta APROVADO!", m);
		}else {
			System.out.printf("a sua media foi %.1f. Portanto voce esta REPROVADO!", m);		
		}
		
		ler.close();

	}

}
