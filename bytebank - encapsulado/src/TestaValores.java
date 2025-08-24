
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24322);
		Conta conta2 = new Conta(1337, 24323);
		
		//System.out.println(conta.getTotal());
		
		Conta conta3 = new Conta(1337, 24324);
		System.out.println(Conta.getTotal());
		
		
	}
}
