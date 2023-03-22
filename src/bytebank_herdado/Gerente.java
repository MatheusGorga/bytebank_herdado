package bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public double getBonificacao() {
		return super.getSalario(); // super a palavra dedicada a atributos da classe de cima e this da que esta
	}

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
