package bytebank_herdado;

public class TesteSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		g1.setSenha(2222);
		
		Administrador a1 = new Administrador();
		a1.setSenha(2222);
		
		Cliente c1 = new Cliente();
		c1.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		
	
		
		si.Autentica(g1);
		si.Autentica(c1);
		si.Autentica(a1);
		
		
	
		
	}

}
