package conteudo_explicacao;

public class Diretor extends Funcionario implements Autenticavel{

	public boolean autentica(int senha){
		return true;
	}
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
