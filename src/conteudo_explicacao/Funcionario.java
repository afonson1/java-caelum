package conteudo_explicacao;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	//Construtor, ainda não foi visto na apostila, aguardar..
	/*public Funcionario(String nome, String cpf, double salario){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}*/
	
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
	public double getBonificacao(){
		return this.salario * 0.10;
	}

}
