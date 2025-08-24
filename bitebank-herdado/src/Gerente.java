
public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return this.senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("pode entrar");
			return true;
		}else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
	
}
