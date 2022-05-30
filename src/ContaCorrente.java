
public class ContaCorrente extends Conta {
	public ContaCorrente(Cliente cliente, Banco banco, String agencia) {
		super(cliente, banco, agencia);

	}

	private static double taxa = 1;

	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		this.saldo -= taxa;
	
	}
}
