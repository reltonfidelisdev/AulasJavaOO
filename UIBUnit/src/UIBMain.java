
public class UIBMain {

	public static void main(String[] args) {


		Cliente clienteUm = new Cliente();
		Cliente clienteDois = new Cliente();
		
		Conta contaUm 	= new Conta();
		Conta contaDois = new Conta();
		
		contaUm.setCliente(clienteUm);
		contaDois.setCliente(clienteDois);
		
		contaUm.Debitar(100);
		contaUm.Creditar(50);
		contaDois.transferir(50, contaUm.getCliente());


	}

}
