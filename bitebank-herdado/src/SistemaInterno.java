
public class SistemaInterno {
	
	private int senha;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("pode entrar");
		}else {
			System.out.println("nao pode entrar");
		}
	}
}
