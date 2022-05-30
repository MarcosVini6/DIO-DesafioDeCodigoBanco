
public class Conta implements IConta {

	private static int SEQUENCIAL = 1;

	protected String agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected Banco banco;
	protected static String msgErro = "Saldo insulficiente para essa operação";

	public Conta(Cliente cliente, Banco banco, String agencia) {
		try {
			this.agencia = banco.getAgencia(agencia);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else
			exibeMenssagemErro(msgErro);
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if (contaDestino != null && this.saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else
			exibeMenssagemErro(msgErro);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Banco: %s", this.banco.nome));
		System.out.println(String.format("Agencia: %s", this.agencia));
		System.out.println(String.format("Numero: %s", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));

	}

	@Override
	public void exibeMenssagemErro(String mensagem) {
		System.out.println(mensagem);
	}

}
