public class FuncionarioTeste {

	private String nome;
	private String cpf;
	private double salario;
	private int tipo = 0; // 0 - funcinario comum, 1 - gerente, 2- diretor
	private int senha;
	

	public FuncionarioTeste(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public boolean autentica(int senha) {
		return this.senha == senha;
	}

	public double getBonificado() {

		if (this.tipo == 0) {
			return salario * 0.1;
		} else if (this.tipo == 1) {
			return this.salario;
		} else {
			return this.salario  + 1000;
		}

	}

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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
