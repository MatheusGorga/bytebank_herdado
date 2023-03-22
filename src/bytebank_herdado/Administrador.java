package bytebank_herdado;

public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public double getBonificacao() {
		return 50; // super a palavra dedicada a atributos da classe de cima e this da que esta
	}

	public Administrador() {
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
