package br.com.caelum.contas.main;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaLista {

	public static void main(String[] args) {
		
		List<Conta> colecaoDeConta = new LinkedList<Conta>();
		
		Random gerador = new Random();
		
		for (int i = 0; i < 10; i++){
			Conta conta = new ContaCorrente();
			int valor = gerador.nextInt(30000);
			new Double(valor).doubleValue();
			conta.deposita(valor);
			colecaoDeConta.add(conta);
		}
		
		for (int i = 0; i < 10; i++){
			System.out.println(colecaoDeConta.get(i).getSaldo());
		}
		
	}

}
