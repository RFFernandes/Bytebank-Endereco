

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	
	public Conta (int agencia, int numero) {
		this.agencia = agencia; 
		this.numero = numero; 
		this.saldo = 100;
		total++;
		System.out.println("criando uma conta");
		
	}
	

	public double getSaldo() {
		return this.saldo; 
	}
	
	public void setNumero(int numero) {
		this.numero = numero; 
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
