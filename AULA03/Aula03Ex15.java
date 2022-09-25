package Aula03;

import java.util.Scanner;

/*15. A partir de três valores que serão digitados, verificar se formam ou não
 *  um triângulo. Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou equilátero”.
 *  Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o 
 *  equilátero, todos os lados iguais. Para existir triângulo é necessário que a soma de dois lados 
 *  quaisquer seja maior que o outro, isto, para os três lados.
 */

public class Aula03Ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int L1, L2, L3;
		
		System.out.printf("Digite o valor do primeiro lado: ");
		L1 = ler.nextInt();
		
		System.out.printf("Digite o valor do segundo lado: ");
		L2 = ler.nextInt();
		
		System.out.printf("Digite o valor do terceiro lado: ");
		L3 = ler.nextInt();
		
		if (L1 < (L2 + L3) && L2 < (L1 + L3) && L3 < (L1 + L2)) {
			if (L1 == L2 && L1 == L3){
				System.out.println("Tres lados iguais. Formam um Triangulo Equilatero");
			}else if(L1 == L2 || L1 == L3){
				System.out.println("Dois lados iguais. Formam um Triangulo Isosceles");
			}else {
				System.out.println("Tres lados diferentes. Formam um Triangulo Escaleno");
			}					
		} else {
			System.out.println("As medidas fornecidas nao formam um triangulo");
		}
		
		ler.close();
		
	}
	
}
