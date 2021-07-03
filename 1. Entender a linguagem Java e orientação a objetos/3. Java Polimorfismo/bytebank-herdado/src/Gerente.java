
public class Gerente extends Funcionario {
	
	private int senha;

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public boolean autentica(int senha) {
		return this.senha == senha;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificado() {
		return super.salario;
	}
	
}
