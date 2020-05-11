package br.com.caelum.contas.main;

public class TestaString {

	public static void main(String[] args) {
		String s = "fj11";
		String alterada = s.replaceAll("1", "2");
		System.out.println(alterada);
		System.out.println("Está vazia? " + alterada.isEmpty());
		System.out.println("Letra no índice 1: " + alterada.charAt(1));
		System.out.println("Tamanho: " + s.length());
		if (s.indexOf("fj") >= 0){
			System.out.println("Correto");
		}
		if ("qwerASDFzxcv".indexOf ("ASDF") >= 0) {
		    System.out.println ("ASDF foi encontrada em qwerASDFzxcv");
		}
	}

}
