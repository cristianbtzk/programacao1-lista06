package atividade;

import java.util.ArrayList;
import java.util.List;

public class Escola {
	private String nome;
	private List<Livro> livros = new ArrayList<Livro>();
	private List<Curso> cursos = new ArrayList<Curso>();
	
	public Escola() {}
	
	public Escola(String nome, String nomeCurso, int maxAlunosCurso) {
		setNome(nome);
		Curso curso = new Curso(nomeCurso, maxAlunosCurso);
		cursos.add(curso);
	}
	
	public boolean adicionarLivro(Livro livro) {
		return livros.add(livro);
	}
	
	public void adicionarPessoa(String nomeCurso, Pessoa pessoa) {
		for(Curso curso: cursos) {
			if(curso.getNome().equalsIgnoreCase(nomeCurso)) {
				curso.adicionarPessoa(pessoa);
				System.out.println(pessoa.getNome()+" foi matriculado no curso de "+nomeCurso);
			}
		}
		
	}
	
	public boolean adicionarCursos(String nome, int maxAlunos) {
		Curso curso = new Curso(nome, maxAlunos);
		return cursos.add(curso);
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Escola [nome=");
		builder.append(nome);
		builder.append("]");
		for (Livro livro : livros) {
			builder.append(livro.toString());
		}
		for (Curso curso : cursos) {
			builder.append(curso.toString());
		}
		return builder.toString();
	}
	
	
}
