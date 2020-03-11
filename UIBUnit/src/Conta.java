
public class Conta {
	private String numero;
	private double saldo;
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void Creditar(double valor) {
		
		this.saldo = saldo + valor;
		System.out.println(saldo);
	}
	
	public double Debitar(double valor) {
		
		this.saldo = saldo - valor;
		System.out.println(saldo);
		return saldo;
	}
	
	public double transferir(double valor, Cliente cliente) {
		this.saldo = saldo - valor;
		
		System.out.println(saldo);
		return valor;
	}
	
	
}
