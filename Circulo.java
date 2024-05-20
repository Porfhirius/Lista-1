package aulaExtra;

public class Circulo {
	private double raio;
	
public Circulo (double novoRaio) {
		this.raio = novoRaio;
	}
public double getRaio() {
	return raio;
}

public void setRaio(double novoRaio) {
	this.raio = novoRaio;
}

public double calcularAreaDoCirculo() {
	return 3.14*raio*raio;
}


}
