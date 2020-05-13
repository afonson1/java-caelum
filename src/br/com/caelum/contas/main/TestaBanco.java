package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {

	public static void main(String[] args) {
		Banco banco = new Banco("CaelumBank", 999);
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setTitular("Afonso");
		c1.setNumero(1);
		c1.setAgencia("1000");
		c1.deposita(1000000);
		banco.adiciona(c1);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.setTitular("Joker");
		c2.setNumero(2);
		c2.setAgencia("1000");
		c2.deposita(890000);
		banco.adiciona(c2);
		
		banco.ListarPosicoesDoVetor();
		
		for (int i = 2; i < 5; i++){
			ContaCorrente c3 = new ContaCorrente();
			c3.setTitular("Titular" + i);
			c3.setNumero(i);
			c3.setAgencia("1000");
			c3.deposita(i * 1000);
			banco.adiciona(c3);
		}
		banco.mostraContas();
		System.out.println(banco.contem(c1));
	}
}
