package conteudo_explicacao;

public abstract class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected double salario;
	
	//Getters e Setters
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Métodos
	public abstract double getBonificacao();

}
