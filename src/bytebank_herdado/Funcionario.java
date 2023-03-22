package bytebank_herdado;


// abstract é um conceito de abstração que nao permite que seja instanciada a partir da cla
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// metodos abastratos nao possuem implementação
	public abstract double getBonificacao() ;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
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
	
		

}
