package aulaExtra;

public class ContaCorrente {
	private int numeroDaConta;
	private double saldo;
	
	public ContaCorrente (int novoNumeroDaConta, double novoSaldo) {
		
		this.numeroDaConta = novoNumeroDaConta;
		this.saldo = novoSaldo;
	}
	
	public double getsaldo() {
		return saldo;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void setsaldo(int novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	public void deposita(double valor) {
		this.saldo = saldo + valor;
	}
	
	public void sacar(double valor) {
		this.saldo = saldo - valor;
	}
		
	public String imprimirinformaçoes() {
		return "O número da conta é " + this.numeroDaConta + "\no saldo é " + this.saldo  + ".";
	}
}
