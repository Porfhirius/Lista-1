package aulaExtra;

public class Produto {
	private String nome;
	private double preco;
	private int quanti;
	
	
	public Produto(String novoNome, double novoPreco, int novaQuanti) {
		this.nome = novoNome;
		this.preco = novoPreco;
		this.quanti = novaQuanti;
 }

	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuanti() {
		return quanti;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setPreco(double novoPreco) {
		this.preco = novoPreco;
	}
	
	public void setQuanti(int novaQuanti) {
		this.quanti = novaQuanti;
	}
	
	public double calcularTotal() {
		return preco*quanti;
	}

}
