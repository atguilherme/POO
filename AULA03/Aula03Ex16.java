package Aula03;

import java.util.*;

/*16. Verificar se três valores quaisquer (A, B, C) que serão digitados formam ou não
 *  um triângulo retângulo. Lembre-se que o quadrado da hipotenusa é igual à soma
 *  dos quadrados dos catetos.
 */


public class Aula03Ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Double a, b, c, xCatetos, xHipotenusa;
		
		System.out.printf("Digite o valor do primeiro lado: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo lado: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro lado: ");
		c = ler.nextDouble();
		
		xHipotenusa = Math.pow(a, 2);
		System.out.println(xHipotenusa);
		xCatetos = 	Math.pow(b, 2) + Math.pow(c, 2);
		System.out.println(xCatetos);
		if(xHipotenusa == xCatetos){
			
			System.out.println("E um Triangulo Retangulo");
			
		}else {

			System.out.println("Nao e um Triangulo Retangulo");
			
		}
		
		ler.close();
		
	}
	
}
