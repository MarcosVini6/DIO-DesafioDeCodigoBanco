
public class Cliente {

	public Cliente(String nome, int idade, String telefone, String email, String cpf) throws Exception {
		this.nome = nome;
		setIdade(idade);
		this.telefone = telefone;
		setEmail(email);
		this.cpf = cpf;
	}

	String nome;
	int idade;
	String telefone;
	String email;
	String cpf;

	public void setEmail(String email) throws Exception {
		if (!email.contains("@")) {
			throw new Exception("Email inválido");
		}
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws Exception {
		if (idade < 16) {
			throw new Exception("Idade insuficiente");
		}
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

}
