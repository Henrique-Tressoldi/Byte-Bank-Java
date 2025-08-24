
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("henrique");
		System.out.println(g1.getNome());
		g1.setSenha(3003);
		System.out.println(g1.getSenha());
		g1.setSalario(5000);
		System.out.println(g1.getBonificacao());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registraGerente(g1);
		
		System.out.println(controle.getSoma());
	}
}
