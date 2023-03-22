package bytebank_herdado;

public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		g1.setNome("G1 teste");
		g1.setSalario(1200);

		g1.setSenha(2222);
		System.out.println("Nome = " + g1.getNome() + " Bonificação = " + g1.getBonificacao());

		boolean autenticado = g1.autentica(2222);

		System.out.println(autenticado);

	}

}
