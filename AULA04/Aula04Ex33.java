package Aula04;

import java.util.Scanner;

/* 33. Entrar via teclado com o sexo de determinado usu�rio, 
 * aceitar somente �F� ou �M� como respostas v�lidas.
 */

public class Aula04Ex33 {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
		
		char sex;
       
        do {
        	System.out.printf("Digite o sexo do usuario (F/M): ");
            sex = ler.next().charAt(0);
        }while(sex != 'F' && sex != 'M');
        
        ler.close();

	}
}
