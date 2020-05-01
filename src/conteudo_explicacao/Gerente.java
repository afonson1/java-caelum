package conteudo_explicacao;


public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	private int numeroDeFuncionariosGerenciados;

	//Getters e Setters
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(
			int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}
	
	//Métodos
	public boolean autentica(int senha){
		if (this.senha == senha){
			System.out.println("Acesso Permitido!");
			return true;
		}else{
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	@Override
	public double getBonificacao(){
		//O super foi utilizado para chamar o método 'getBonificacao' de uma super classe de Gerente.
		//return super.getBonificacao();
		//return salario * 0.15;
		return this.salario * 1.4 + 1000;
	}
}