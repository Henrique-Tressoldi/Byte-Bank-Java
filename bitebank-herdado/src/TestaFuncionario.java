
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente henrique = new Gerente();
		henrique.setNome("Henrique Tressoldi");
		henrique.setCpf("129-422-417-48");
		henrique.setSalario(3000);
		henrique.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(henrique);
		
		
		System.out.println(henrique.getNome());
		
		System.out.println(henrique.getBonificacao());
		

	}

}
