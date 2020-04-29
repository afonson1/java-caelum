package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class Programa {

	public static void main(String[] args) {
		//Conta c = new Conta();
		
		Conta c = new Conta("Afonso");
		//c.setTitular("Afonso");
		System.out.println(c.getTitular()+"\n");
		/*Conta c1 = new Conta();
		c1.setTitular("Syntikhiê");
		int total = Conta.getTotalDeContas();
		System.out.println("Total de contas: " + total);
		*/
		
		Data data = new Data();
		data.setAno(2020);
		data.setMes(11);
		data.setDia(2);
		System.out.println(data.formatada());
		data.verificaData(data.getDia(), data.getMes(), data.getAno());
	}
}