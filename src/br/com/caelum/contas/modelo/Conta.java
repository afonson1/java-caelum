package br.com.caelum.contas.modelo;

public class Conta {
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

	public String getTipo(){
		return "Conta ";
	}
	
	public void saca (double valor){
		this.saldo = this.saldo - valor;
	}

	public void deposita (double valor){
		this.saldo += valor;
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
		return dados;
	}
}