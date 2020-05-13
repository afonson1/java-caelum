package br.com.caelum.contas.modelo;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;
	
	//outros atributos, se necesário
	
	//CONSTRUTOR
	public Banco(String nome, int numero){
		this.setNome(nome);
		this.setNumero(numero);
		this.setContas(new ContaCorrente[10]);
	}

	
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}
	
	//MÉTODOS
	public void adiciona(Conta c){
		for (int i = 0; i < this.contas.length; i++){
			if (this.contas[i] == null){
				contas[i] = c;
				System.out.println("Adicionado na posição " + i);
				break;
			}
		}
	}
	
	public void ListarPosicoesDoVetor(){
		for (int i = 0; i < this.contas.length; i++){
			System.out.println("Posição " + i);
		}
	}
	
	public boolean contem(Conta conta){
		for(int i = 0; i < this.contas.length; i++){
			if(this.contas[i] == conta){
				return true;
			}
		}
		return false;
	}
	
	public void mostraContas (){
		try{
			for (int i = 0; i < (this.contas.length - 1); i++){
				this.contas[i].getTitular();
				System.out.println("\nConta na posição " + i);
				System.out.println("Titular: " + this.contas[i].getTitular());
				System.out.println("Numero" + this.contas[i].getNumero());
				System.out.println("Agência" + this.contas[i].getAgencia());
			}
		}catch(NullPointerException e){
				System.out.println("Fim da lista");
		}
	}
}