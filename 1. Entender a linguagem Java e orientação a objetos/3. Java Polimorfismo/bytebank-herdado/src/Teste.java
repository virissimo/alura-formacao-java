
public class Teste {

	public static void main(String[] args) {
		
		FuncionarioTeste ft = new FuncionarioTeste("João", "4273890234", 3000);
		System.out.println(ft.getBonificado());

		FuncionarioTeste ft2 = new FuncionarioTeste("José", "4245890234", 5000);
		ft2.setTipo(1);
		System.out.println(ft2.getBonificado());
		
		FuncionarioTeste ft3 = new FuncionarioTeste("José", "4245890234", 6000);
		ft3.setTipo(2);
		System.out.println(ft3.getBonificado());
	}

}
