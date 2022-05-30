
public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente, Banco banco, String agencia) {
		super(cliente, banco, agencia);
	}

	public void rendimento() {
		this.saldo += this.saldo * 0.03;
	}

}
