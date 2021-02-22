package atividade;

public class Main {
	public static void main(String[] args) {
		Escola escola = new Escola("IFC", "Ciência da Computação", 50);
		
		Livro livro1 = new Livro("Informática para iniciantes", "John Doe");
		Livro livro2 = new Livro("Programação", "John Tre");
		escola.adicionarLivro(livro1);
		escola.adicionarLivro(livro2);
		
		escola.adicionarCursos("Agropecuária", 100);

		Aluno aluno1 = new Aluno("Pedro", "123456");
		Aluno aluno2 = new Aluno("Mácia", "321546");
		Professor professor1 = new Professor("Daniel", "Algoritmos");

		escola.adicionarPessoa("Ciência da Computação", aluno1);
		escola.adicionarPessoa("Ciência da Computação", professor1);

		escola.adicionarPessoa("Agropecuária", aluno2);

		System.out.println(escola.toString());
	}
}
