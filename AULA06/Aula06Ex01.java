package Aula06;

import java.util.Scanner;

/* 53. Crie as classes conforme o Diagrama de Classe (UML) abaixo. Crie um programa 
 * que utilize essas classes para cadastrar 5 clientes em uma lista de clientes e 
 * pergunte para cada cliente se ele tem ou não conta bancária. Caso o cliente tenha, 
 * permita ele cadastrar os dados da conta bancária. Ao final exibir todos os clientes e 
 * suas respectivas contas bancárias, se houver.
 */

public class Aula06Ex01 {

	   public static void main(String[] args) {
	        
	        Scanner ler = new Scanner(System.in);
	       
	        // Cria um array contendo 5 posições para armazenar objetos
	        Cliente[] listaClientes = new Cliente[5];
	       
	        int id;
	        String nome, email, agencia, conta;
	        int idade;
	        char possuiConta;
	        double saldo;
	        
	       
	        for (int i=0; i<=4; i++) {
	   
	            Cliente c;
	           
	            // Popula o objeto (preenche os atributos do objetos)
	            System.out.printf("Digite o id da pessoa: ");
	            id = ler.nextInt();
	           
	            System.out.printf("Digite o nome da pessoa: ");
	            nome = ler.next();
	           
	            System.out.printf("Digite a idade da pessoa: ");
	            idade = ler.nextInt();
	            
	            System.out.printf("Digite o email da pessoa: ");
	            email = ler.next();
	           
	           	System.out.printf("Possui Conta Corrente? (S/N)");
	            possuiConta = ler.next().charAt(0);
	           
	            if (possuiConta == 'S' || possuiConta == 's') {
	                System.out.printf("Digite o numero da Agencia: ");
	                agencia = ler.next();
	               
	                System.out.printf("Digite o numero da conta: ");
	                conta = ler.next();
	               
	                System.out.printf("Digite o saldo da conta: ");
	                saldo = ler.nextDouble();
	               
	                // Instancia o dependente
	                ContaBancaria contab = new ContaBancaria(agencia, conta, saldo);
	               
	                // Instancia (cria) o objeto cliente COM os dados da conta
	                c = new Cliente(id, nome, idade, email, contab);
	            }
	            else {
	                // Instancia (cria) o objeto cliente SEM os dados da conta
	                c = new Cliente(id, nome, idade, email, null);            
	            }
	           
	            // Adiciona o objeto no array "listaClientes"
	            listaClientes[i] = c;            
	        }
	           
	        // exibir lista e dados dos clientes
	        for (int i=0; i<=4; i++) {
	            System.out.printf("\nCliente: %d, Nome: %s, Idade: %d, E-mail: %s", listaClientes[i].id, listaClientes[i].nome, listaClientes[i].idade, listaClientes[i].email);
	                   
	            if (listaClientes[i].contabancaria != null) {
	                System.out.printf("\n Conta: %s", listaClientes[i].exibirDadosConta());
	            }
	        }
	        
	       ler.close();
	       
	    }

}
