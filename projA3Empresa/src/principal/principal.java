package principal;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Empresa aEmpresa = new Empresa();
		Funcionario oFuncionario = new Funcionario();
		
		System.out.println("Sobre a EMPRESA");
		System.out.println("Informe o nome da empresa:");
		aEmpresa.setNome(ler.nextLine());
		
		System.out.println("Informe a quantidade de funcionários: ");
		aEmpresa.setQtdFunc(ler.nextInt());
		
		ler.nextLine();
		System.out.println("Sobre o FUNCIONÁRIO");
		System.out.println("Informe o nome do funcionário:");
		oFuncionario.setNome(ler.nextLine());
		
		System.out.println("Informe o salário bruto do funcionario:");
		oFuncionario.setSalBruto(ler.nextDouble());
		
		System.out.println("É pessoa jurídica? (Se sim, escreva 'True', se não escreva 'False')");
		oFuncionario.setpJur(ler.nextBoolean());
		
		oFuncionario.setEmpresa(aEmpresa);
		
		System.out.println("******** EMPRESA ********");
		System.out.println("NOME: " + aEmpresa.getNome());
		System.out.println("QUANTIDADE DE FUNCIONARIOS: " + aEmpresa.getQtdFunc());
		
		System.out.println("******** FUNCIONARIO ********");
		System.out.println("NOME: " + oFuncionario.getNome());
		System.out.println("SALARIO BRUTO: R$" + oFuncionario.getSalBruto());
		System.out.println("PESSOA JURIDICA: " + ((oFuncionario.ispJur()) ? "Sim" : "Nao"));
		System.out.println("SALÁRIO LÍQUIDO: R$" + oFuncionario.getSalario());
	}

}
