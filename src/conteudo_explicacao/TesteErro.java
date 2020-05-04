package conteudo_explicacao;

import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteErro {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}
	
	static void metodo1(){
		System.out.println("Inicio do método1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	static void metodo2(){
		System.out.println("Inicio do metodo2");
		ContaCorrente cc = new ContaCorrente();
		for (int i = 0; i <=15; i++){
			try {
				cc.deposita(i + 1000);
				System.out.println(cc.getSaldo());
				if (i == 5){
					cc = null;
				}
			} catch (NullPointerException e){
				System.out.println("erro: " + e);
			}
		}
		System.out.println("Fim do metodo2");
	}
}