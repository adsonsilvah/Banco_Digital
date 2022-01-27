package Bank;

public class IndexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cliente Silva = new cliente();
		Silva.setNome("Silva");
		
		Conta cc = new ContaCorrente(Silva);
		Conta poupanca = new ContaPoupanca(Silva);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
