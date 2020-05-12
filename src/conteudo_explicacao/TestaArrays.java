package conteudo_explicacao;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		
		for (int i = 0; i < 10; i++){
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			contas[i] = conta;
			System.out.print(contas[i].getSaldo() + ", ");
		}
		
		double media = 0, soma = 0;
		System.out.println("");
		
		for (int i = 0; i < 10; i++){
			soma += contas[i].getSaldo();
			System.out.print(soma + ", ");
			media = soma/10;
			System.out.println(media);
		}
		System.out.println(media);
	}

}
