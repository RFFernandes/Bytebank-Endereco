
public class TestaCliente {

	public static void main(String[] args) {
		
		
		Conta contaDoRafa = new Conta();
		contaDoRafa.titular = new Cliente();
			
		
		contaDoRafa.titular.nome = "Rafa Bicha"; 
		contaDoRafa.saldo = 200; 
		
		System.out.println(contaDoRafa.titular.nome);
		System.out.println(contaDoRafa.saldo);
		
		
	}
	
}
