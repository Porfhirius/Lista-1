package aulaExtra;

public class Retangulo {
	private double base;
	private double altura;
	
public Retangulo (double novaBase, double novaAltura) {
	
	this.base = novaBase;
	this.altura = novaAltura;
	}
public double getbase() {
	return base;
}

public double getaltura() {
	return altura;
}

public void setbase(double novaBase) {
	this.base = novaBase;
}

public void setAlturae(double novaAltura) {
	this.altura = novaAltura;
}
public double calcularArea() {
	return base * altura;
}
public double calcularPerimetr() {
	return (2*base) + (2*altura);
}
}
