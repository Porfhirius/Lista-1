package aulaExtra;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String novoNome,int novaIdade, double novaAltura) {

		this.nome = novoNome;
		this.idade = novaIdade;
		this.altura = novaAltura;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}
	
	public String imprimirinformaçoes() {
		return "O nome é " + this.nome + "\na idade é " + this.idade + "\na altura é " + this.altura + ".";
			
	}
}
