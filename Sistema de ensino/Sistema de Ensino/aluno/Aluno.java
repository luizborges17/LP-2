package aluno;

public class Aluno {

	private String nome;
	private String curso;
	private Integer matricula;
	private Double prova1;
	private Double prova2;
	private Double prova3;
	private Double prova4;

	public Aluno(String nome, String curso, Integer matricula, Double prova1, Double prova2, Double prova3,
			Double prova4) {
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.prova3 = prova3;
		this.prova4 = prova4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Double getProva1() {
		return prova1;
	}

	public void setProva1(Double prova1) {
		this.prova1 = prova1;
	}

	public Double getProva2() {
		return prova2;
	}

	public void setProva2(Double prova2) {
		this.prova2 = prova2;
	}

	public Double getProva3() {
		return prova3;
	}

	public void setProva3(Double prova3) {
		this.prova3 = prova3;
	}

	public Double getProva4() {
		return prova4;
	}

	public void setProva4(Double prova4) {
		this.prova4 = prova4;
	}

}