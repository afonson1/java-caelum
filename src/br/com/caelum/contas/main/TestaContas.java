package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.javafx.api.main.SistemaBancario;

public class TestaContas {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.setTitular("Afonso");
		cc.setAgencia("1");
		cc.setNumero(1);
		SistemaBancario.mostraTela(true);
		//TelaDeContas.main(args);
	}

}
