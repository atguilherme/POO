package Aula05;

/* 48. Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que 
 * utilize essa classe para cadastrar 5 clientes em uma lista de clientes. 
 * Ao final exibir apenas os clientes que tem mais de 18 anos.
 */

import java.util.Scanner;

public class Programa_Cliente {

	public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        

        Cliente[] listaClientes = new Cliente[5];
       
        for (int i=0; i<=4; i++) {
            // Instancia (cria) o objeto
            Cliente c = new Cliente();
           

            System.out.printf("Digite o id do cliente: ");
            c.id = ler.nextInt();
           
            System.out.printf("Digite o nome do cliente: ");
            c.nome = ler.next();
        
            System.out.printf("Digite a idade do cliente: ");
            c.idade = ler.nextInt();
            
            System.out.printf("Digite o email do cliente: ");
            c.email = ler.next();


	        listaClientes[i] = c;            

        }
        
        for (int i=0; i<=4; i++) {
        	
        	if (listaClientes[i].idade >=18 ) {
        		System.out.printf("\nCliente: %d, Nome: %s, Idade: %d, E-mail: %s", listaClientes[i].id, listaClientes[i].nome, listaClientes[i].idade, listaClientes[i].email);
        	}
        }
        
        
	}

}
