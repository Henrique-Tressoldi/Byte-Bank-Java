
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaHenrique = new Conta();
		contaHenrique.saldo = 100;
		contaHenrique.deposita(100);
		
		System.out.println(contaHenrique.saldo);
		
		Conta contaDhynorha = new Conta();
		contaDhynorha.saldo = 200;
		
		System.out.println(contaDhynorha.saldo);
		
		contaHenrique.transfere(100, contaDhynorha);
		
		System.out.println(contaDhynorha.saldo);
		System.out.println(contaHenrique.saldo);


		
		
		
	}
}
