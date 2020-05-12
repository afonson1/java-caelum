package conteudo_explicacao;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TesteAula14 {
	
	public static double[] saldoDasContas;
	
	public void imprimeArray(int[] array){
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		Conta[] minhasContas;
		minhasContas = new Conta[10];
		
		ContaCorrente contaNova = new ContaCorrente();
		contaNova.deposita(1000.0);
		ContaPoupanca contaPoup = new ContaPoupanca();
		contaPoup.deposita(200);
		
		minhasContas[0] = contaNova;
		minhasContas[1] = contaPoup;
		System.out.println(minhasContas[0].getSaldo());
		System.out.println(minhasContas[1].getSaldo());
		
		int[] idades = new int[10];
		for(int i = 0; i < 10 ; i++){
			idades[i] = i * 10;
		}
		for (int i = 0; i < 10; i++){
			System.out.println(idades[i]);
		}
		TesteAula14 teste = new TesteAula14();
		teste.imprimeArray(idades);
	}

}
