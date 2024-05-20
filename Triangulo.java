package aulaExtra;

public class Triangulo {
	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	public Triangulo(int novoLadoA , int novoLadoB , int novoLadoC) {
		this.ladoA = novoLadoA;
		this.ladoB = novoLadoB;
		this.ladoC = novoLadoC;
	}
	
	public int getLadoA() {
		return ladoA;
	}
	
	public int getLadoB() {
		return ladoB;
	}
	
	public int getLadoC() {
		return ladoC;
	}
	
	public void setLadoA(int  novoLadoA) {
		this.ladoA = novoLadoA;
	}
	
	public void setLadoB(int novoLadoB) {
		this.ladoB  = novoLadoB;
	}
	
	public void setLadoC(int novoLadoC) {
		this.ladoC = novoLadoC;
	}
	
	public double calculararea(double base, double altura) {
		return base* altura/2;
	}
	
	public double calcularperimetro() {
		return ladoA + ladoB + ladoC;
	}
}
