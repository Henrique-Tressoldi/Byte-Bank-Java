
public class ControleBonificacao {
	
	private double soma;
	
	public void registraGerente(Gerente g) {
		double boni = g.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return this.soma;
	}
}
