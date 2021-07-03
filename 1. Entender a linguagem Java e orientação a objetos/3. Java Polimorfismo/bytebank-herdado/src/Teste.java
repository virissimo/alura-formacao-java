
public class Teste {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Francisco Virissimo", "3423423", 67855867342.00);		
		System.out.println(f.getNome());		
		System.out.println(f.getBonificado());
		
		Gerente g = new Gerente("João", "534565847566", 70000);
		System.out.println(g.getNome());		
		System.out.println(g.getBonificado());
		System.out.println(g.autentica(25432534));
		g.setSenha(25432534);
		System.out.println(g.autentica(25432534));
	}
}
