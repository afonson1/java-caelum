package br.com.caelum.contas.modelo;

public class Cliente {

	String nome;
	String sobrenome;
	String cpf;
	
	public Cliente (String cpf){
		if (validaCpf(cpf)){
			this.cpf = cpf;
		}
	}
	
	public boolean validaCpf (String cpf){
		return true;
	}

}
