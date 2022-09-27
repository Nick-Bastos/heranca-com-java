package Herança;

public class TestaConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(200.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		System.out.println(cp.getSaldo());
		
		cc.transfere(10.0, cp);
		System.out.println("Saldo conta poupança é: " + cp.getSaldo());
		System.out.println("Saldo conta corrente é: " + cc.getSaldo());

	}

}
