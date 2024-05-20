package aulaExtra;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String editora;
	
	
	public Livro (String novoTitulo,String novoAutor,int novoAnoPublicacao,String novaEditora) {
		this.titulo = novoTitulo;
		this.autor = novoAutor;
		this.anoPublicacao = novoAnoPublicacao;
		this.editora = novaEditora;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setTitulo (String novoTitulo) {
		this.titulo = novoTitulo;
	}
	
	public void setAutor(String novaAutor) {
		this.autor = novaAutor;
	}
	
	public void setAnoPublicacao(int novoAnoPublicacao) {
		this.anoPublicacao = novoAnoPublicacao;
	}
	
	public void setEditora(String novaEditora) {
		this.editora = novaEditora;
	}
}
