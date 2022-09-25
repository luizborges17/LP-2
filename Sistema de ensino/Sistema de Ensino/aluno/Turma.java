package aluno;

import java.util.LinkedList;
import java.util.List;

public class Turma {

	private List<Aluno> turma = new LinkedList<Aluno>();

	public void cadastrarAluno(Aluno aluno) {
		turma.add(aluno);
	}

	public List<Aluno> getPessoas() {
		return turma;
	}

}
