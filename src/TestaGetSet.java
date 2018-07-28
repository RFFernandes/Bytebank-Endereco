
public class TestaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24667);
		Cliente Rafa = new Cliente();
		
		conta.setTitular(Rafa);
		Rafa.setNome("Rafa Bicha");
		
		conta.setAgencia(2424);
		System.out.println("sua conta é " + conta.getAgencia());
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("garoto de programa");
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(Conta.getTotal());
		
	}
	
}
