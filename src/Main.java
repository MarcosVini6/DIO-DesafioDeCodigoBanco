import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1;
		Banco banco;
		Conta contaCorrente;
		ContaPoupanca contaPoupanca;

		
		

		var agencias = new ArrayList<String>();
		agencias.add("1");
		agencias.add("2");
		
	
		
		try {
			cliente1 = new Cliente("João", 17, "40028922", "joao123@bol.com", "21234329283");
			banco = new Banco("Itau",agencias);
			contaCorrente = new ContaCorrente(cliente1, banco, "1");
			contaCorrente.depositar(100);
			System.out.println("Conta corrente recebe deposito");
			System.out.println("-------------------------------");
			contaCorrente.imprimirExtrato();
			System.out.println("----------------------------------");
			contaPoupanca = new ContaPoupanca(cliente1, banco, "1");
			contaCorrente.transferir(100, contaPoupanca);
			System.out.println("transferencia da conta conrrente para poupança");
			System.out.println("----------------------------------");
			contaPoupanca.imprimirExtrato();
			System.out.println("----------------------------------");
			System.out.println("extrato da conta corrente");
			System.out.println("----------------------------------");
			contaCorrente.imprimirExtrato();
			System.out.println("------------------------------------");
			System.out.println("Extrato da poupança com rendimento");
			System.out.println("----------------------------------");
		    contaPoupanca.rendimento();
		    contaPoupanca.imprimirExtrato();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}
	

}
