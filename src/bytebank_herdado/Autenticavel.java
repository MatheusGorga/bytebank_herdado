package bytebank_herdado;

// Contrato autenticavel
	// quem assina o contrato, é obrigado a implementar os metodos set senha e autentica

public abstract interface Autenticavel {

	public abstract boolean autentica(int senha);

	public abstract void setSenha(int senha);

}
