package Aula06;

public class Cliente {

    public int id;
    public String nome;
    public int idade;
    public String email;
    public ContaBancaria contabancaria;
    
    Cliente(int id, String nome, int idade, String email, ContaBancaria Conta){
        this.id = id;
        this.nome = nome;
        this.id = idade;
        this.email = email;
        this.contabancaria = Conta;
    }
    
    public void atualizarEmail(String novoEmail) {
    	this.email = novoEmail;
    }
  
   String exibirNomeIdade() {
	   return (this.nome + " - " + this.idade);
   }
   
   String exibirDadosConta() {
	   return (this.contabancaria.agencia + " - " + this.contabancaria.numero + " - " + this.contabancaria.Saldo);
   }
}
