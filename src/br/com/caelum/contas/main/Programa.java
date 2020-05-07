package br.com.caelum.contas.main;

import java.io.PrintStream;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class Programa {

	public static void main(String[] args) {
		Conta cc =  new ContaCorrente();
		cc.deposita(100);
		cc.setAgencia("123");
		cc.setNumero(125);
		cc.setTitular("Afonso");
		System.out.println("Conta: " + cc);
		
		PrintStream saida = System.out;
		saida.println("ola");
		
		try {
			cc.saca(1000);
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Conseguiu");
	}
}