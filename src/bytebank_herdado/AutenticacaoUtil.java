package bytebank_herdado;

public class AutenticacaoUtil {

	private int senha;

	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

	public void setSenha(int senha) {
		this.senha = senha;

	}
}
