package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	public String getTipo(){
		return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor){
		if (valor < 0){
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		}
		/*nem sempre é interessante utilizarmos um novo tipo de exception! Depende do caso.
		*Neste aqui, seria melhor utilizarmos IllegalArgumentException.
		*A boa prática diz que devemos preferir usar as já existentes do Java sempre que possível.
		*/
		if (this.saldo < valor){
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= (valor + 0.10);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}
