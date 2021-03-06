package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta>{
	//ATRIBUTOS
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	private Data dataDeAbertura = new Data();
	private static int identificador;
	
	//CONSTRUTORES
	public Conta(){
		Conta.identificador = Conta.identificador+1;
	}
	
	public Conta(String titular){
		this.titular = titular;
		Conta.identificador = Conta.identificador+1;
	}
	
	//GETTERS E SETTERS
	public String getTitular(){
		return this.titular;
	}
	
	public void setTitular(String titular){
		this.titular = titular;
	}
	
	public int getNumero(){
		return this.numero;
	}

	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public String getAgencia(){
		return this.agencia;
	}

	public void setAgencia(String agencia){
		this.agencia = agencia;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public abstract String getTipo();
	
	//MÉTODOS
	public boolean equals(Object obj){
		if (obj == null){
			return false;
		}
		
		Conta outraConta = (Conta) obj;
		
		return this.numero == outraConta.numero && this.agencia == outraConta.agencia;
	}
	
	public void saca (double valor){
		this.saldo = this.saldo - valor;
	}

	public void deposita (double valor){
		if (valor < 0){
			throw new IllegalArgumentException("Você tentou depositar um valor inválido");
		} else {
			this.saldo += valor;
		}
	}
	
	public void transfere(double valor, Conta conta){
		this.saca(valor);
		conta.deposita(valor);
	}
	
	double calculaRendimento(){
		return this.saldo+(this.saldo*0.1);
	}

	public static int getTotalDeContas() {
		return identificador;
	}

	String recuperarDadosParaImpressao(){
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
		dados += "\n\nRendimento: " + this.calculaRendimento();
		dados += "\nTipo: " + this.getTipo();
		return dados;
	}

	@Override
	public String toString(){
		return "[titular=" + titular.toUpperCase() + ", numero=" + numero + ", agencia=" + agencia + "]";
	}

	public int compareTo(Conta outraConta){
		return this.titular.compareTo(outraConta.titular);
	}
}