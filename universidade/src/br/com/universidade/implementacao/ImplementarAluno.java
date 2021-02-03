package br.com.universidade.implementacao;


import br.com.universidade.beans.Aluno;
import br.com.universidade.beans.Endereco;

public class ImplementarAluno {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("rua francisco perotti", "70", "casa", "bela vista", "osasco", "Sao Paulo", "06070050");
		Aluno aluno = new Aluno(69817, "guilherme.agb94@gmail.com", "Guilherme",endereco);
		
		Aluno aluno2 = new Aluno(69817, "guilherme.agb94@gmail.com", "Guilherme",new Endereco("rua francisco perotti", "70", "casa", "bela vista", "osasco", "Sao Paulo", "06070050"));
		
		System.out.println(aluno);
		System.out.println(aluno2);
		
		
		System.out.println(aluno.getEndereco().getEstado());
	}

}