package aulaExtra;

public class Gato {
		private String nome;
		private String raca;
		private int idade;
		
		public Gato(String novoNome,String novaRaca, int novaIdade) {
			this.nome = novoNome;
			this.raca = novaRaca;
			this.idade = novaIdade;
		}
		
		public String getNome() {
			return nome;
		}
		
		public String getRaca() {
			return raca;
		}
		
		public int getIdade() {
			return idade;
		}
		
		public void setNome(String novoNome) {
			this.nome = novoNome;
		}
		
		public void setRaca(String novoRaca) {
			this.raca = novoRaca;
		}
		
		public void setIdade(int novaIdade) {
			this.idade = novaIdade;
		}
		
		public String miar () {
			return "Miau!";
		
		}

	}
