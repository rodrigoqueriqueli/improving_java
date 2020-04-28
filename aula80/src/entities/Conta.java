package entities;

public class Conta {

	private int contaCorrente;
	private String name;
	private double balance;

	public Conta(int contaCorrente, String name) {
		this.contaCorrente = contaCorrente;
		this.name = name;
	}

	public Conta(int contaCorrente, String name, double initialDeposit) {
		this.contaCorrente = contaCorrente;
		this.name = name;
		deposito(initialDeposit);
	}

	public int getContaCorrente() {
		return contaCorrente;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposito(double deposito) {
		this.balance += deposito;
	}
	
	public void saque(double saque) {
		this.balance -= saque + 5.0;
	}
	
	public String toString() {
		return  "Account "
				+ String.format("%d", contaCorrente)
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

}
