package bytebank_herdado;

public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		g1.setNome("Matheus");
		g1.setSalario(5000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao control = new ControleBonificacao();
		control.registra(g1);
		control.registra(d);
		control.registra(ev);
		
		
		
		System.out.println(control.getSoma());
	
	}

}
