package conteudo_explicacao.aula_15_15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("Inicianco teste com ArrayList...");
		Collection<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		long inicio_insercao = System.currentTimeMillis();
		for (int i = 0; i < total; i++){
			teste.add(i);
		}
		long fim_insercao = System.currentTimeMillis();
		long tempo_insercao = fim_insercao - inicio_insercao;
		System.out.println("Tempo gasto de inserção: " + tempo_insercao);
		
		long inicio_pesquisa = System.currentTimeMillis();
		for (int i = 0; i < total; i++){
			teste.contains(i);
		}
		long fim_pesquisa = System.currentTimeMillis();
		long tempo_pesquisa = fim_pesquisa - inicio_pesquisa;
		System.out.println("Tempo gasto de pesquisa: " + tempo_pesquisa);
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		
		//TESTE COM HASHSET
		System.out.println("\nInicianco teste com HashSet...");
		Collection<Integer> teste2 = new HashSet<>();
		long inicio2 = System.currentTimeMillis();
		
		long inicio_insercao2 = System.currentTimeMillis();
		for (int i = 0; i < total; i++){
			teste2.add(i);
		}
		long fim_insercao2 = System.currentTimeMillis();
		long tempo_insercao2 = fim_insercao2 - inicio_insercao2;
		System.out.println("Tempo gasto de inserção: " + tempo_insercao2);
		
		long inicio_pesquisa2 = System.currentTimeMillis();
		for (int i = 0; i < total; i++){
			teste2.contains(i);
		}
		long fim_pesquisa2 = System.currentTimeMillis();
		long tempo_pesquisa2 = fim_pesquisa2 - inicio_pesquisa2;
		System.out.println("Tempo gasto de pesquisa: " + tempo_pesquisa2);
		
		long fim2 = System.currentTimeMillis();
		long tempo2 = fim2 - inicio2;
		System.out.println("Tempo gasto: " + tempo2);

	}
}