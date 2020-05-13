// Questão 3 (opcional) do capítulo 14 - Um pouco de arrays
package conteudo_explicacao;

public class TestaSplit {

	public static void main(String[] args) {
		String frase = "Socorraam-me, subi no ônibos em Marrocos";
		String[] palavras = frase.split(" ");
		
		for(int i = (palavras.length - 1); i >= 0; i--){
			System.out.print(palavras[i] + " ");
		}
	}
}
