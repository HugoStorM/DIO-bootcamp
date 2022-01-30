package banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente hugo = new Cliente();
		hugo.setNome("Hugo");
		
		Conta conta = new ContaCorrente(hugo);	
		Conta poupanca = new ContaPoupanca(hugo);
		
		conta.depositar(100);
		conta.tranferir(90, poupanca);
		
		conta.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
