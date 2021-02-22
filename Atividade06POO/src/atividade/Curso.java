package atividade;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private int maxAlunos;
	private List<Pessoa> pessoas= new ArrayList<Pessoa>();

	public Curso() {}
	
	public Curso(String nome, int maxAlunos) {
		setNome(nome);
		setMaxAlunos(maxAlunos);
	}
	
	public boolean adicionarPessoa(Pessoa pessoa) {
		return pessoas.add(pessoa);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMaxAlunos() {
		return maxAlunos;
	}
	public void setMaxAlunos(int maxAlunos) {
		this.maxAlunos = maxAlunos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [nome=");
		builder.append(nome);
		builder.append(", maxAlunos=");
		builder.append(maxAlunos);
		for (Pessoa pessoa: pessoas) {
			builder.append(pessoa.toString());
		}
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
