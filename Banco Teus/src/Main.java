
public class Main {

	public static void main(String[] args) {
		Cliente matheus = new Cliente();
		matheus.setNome("Matheus");
		
		Conta cc = new ContaCorrente(matheus);
		Conta poupanca = new ContaPoupanca(matheus);

		cc.depositar(1000);
		cc.transferir(1000, cc);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}