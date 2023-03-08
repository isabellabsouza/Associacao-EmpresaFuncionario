package principal;

public class Funcionario {
	
	private String nome;
	private double salBruto;
	private boolean pJur;
	private Empresa empresa;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, double salBruto, boolean pJur, Empresa empresa) {
		this.nome = nome;
		this.salBruto = salBruto;
		this.pJur = pJur;
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalBruto() {
		return salBruto;
	}

	public void setSalBruto(double salBruto) {
		this.salBruto = salBruto;
	}

	public boolean ispJur() {
		return pJur;
	}

	public void setpJur(boolean pJur) {
		this.pJur = pJur;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
	public double getSalario() {
		
		double salario;
		if(this.pJur) {
			salario = this.salBruto * 0.8 - 0.01 * this.empresa.getQtdFunc();
		}
		else {
			salario = this.salBruto * 0.9 - 0.02 * this.empresa.getQtdFunc();
		}
		
		return salario;
	}

}
