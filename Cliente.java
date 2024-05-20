package aulaExtra;

public class Cliente {
	private String nome;
	private String CPF;
	private int dia;
	private int mes;
	private int ano;
	
	public Cliente( String novoNome, String novoCPF, int novoDia, int novoMes,int novoAno) {
		this.nome = novoNome;
		this.CPF = novoCPF;
		this.dia = novoDia;
		this.mes = novoMes;
		this.ano = novoAno;
}
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setDia(int novoDia) {
		this.dia = novoDia;
	}
	
	public void setMes(int novoMes) {
		this.mes = novoMes;
	}
	
	public void setAno(int novoAno) {
		this.ano = novoAno;
	}
	
	








}
