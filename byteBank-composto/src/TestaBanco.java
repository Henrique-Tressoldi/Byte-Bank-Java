
public class TestaBanco {
	public static void main(String[] args) {
		Cliente henrique = new Cliente();
		henrique.nome = "henrique";
		henrique.cpf = "222.222.222.22";
		henrique.profissao = "programador";
		
		Conta contaHenrique = new Conta();
		contaHenrique.titular = henrique;
		System.out.println(contaHenrique.titular.cpf);
	}
}
