package banco;

public interface Iconta {

	 void sacar(double valor);

	 void depositar(double valor);

	 void tranferir(double valor, Conta contaDestino);
	 
	 void imprimirExtrato();
}
