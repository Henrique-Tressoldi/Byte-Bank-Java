
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24322);
		conta.setNumero(1377);
		System.out.println(conta.getNumero());
		
		Cliente henrique = new Cliente();
		henrique.setNome("Henrique Tressoldi");
		conta.setTitular(henrique);
		
		conta.getTitular().setProfissao("programador");
		

		System.out.println(Conta.getTotal());
		
	}

}
