package principal;

public class Empresa {
	
	private String nome;
	private int qtdFunc;
	
	
	public Empresa() {
	}

	public Empresa(String nome, int qtdFunc) {
		this.nome = nome;
		this.qtdFunc = qtdFunc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdFunc() {
		return qtdFunc;
	}

	public void setQtdFunc(int qtdFunc) {
		this.qtdFunc = qtdFunc;
	}
	
	
	
	
}
