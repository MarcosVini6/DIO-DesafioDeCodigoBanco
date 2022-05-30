import java.util.List;

public class Banco {
	protected String nome;
	protected List<String> agencias;

	public Banco(String nome, List<String> agencias) {
		this.nome = nome;
		this.agencias = agencias;
	}

	protected String getAgencia(String agencia) throws Exception {
		for (String item : agencias) {
			if (item == agencia) {
				return item;
			}
		}
		throw new Exception("Agencia inexistente");
	}

	public String getNome() {
		return nome;
	}

	public List<String> getAgencias() {
		return agencias;
	}
}
