package conteudo_explicacao.aula_15_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPeformanceDeAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		System.out.println("Iniciando o teste com LinkedList");
		long inicio = System.currentTimeMillis();
		
		//trocar depois por ArrayList
		List<Integer> teste = new LinkedList<>();
		
		for (int i = 0; i < 30000; i++){
			teste.add(0, 1);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo gasto com LinkedList: " + tempo);
		
		System.out.println("\nIniciando o teste com ArrayList");
		long inicio1 = System.currentTimeMillis();

		List<Integer> teste1 = new ArrayList<>();
		
		for (int i = 0; i < 30000; i++){
			teste1.add(0, 1);
		}
		
		long fim1 = System.currentTimeMillis();
		double tempo1 = (fim1 - inicio1) / 1000.0;
		System.out.println("Tempo gasto com ArrayList: " + tempo1);
		
	}

}