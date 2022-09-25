package aluno;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {

		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("Para cadastrar aluno digite 1, para sair digite 2: ");
			Integer lup = in.nextInt();
			if (lup == 1) {
				Turma turma = new Turma();

				Scanner sc = new Scanner(System.in);

				System.out.println("Digite o nome:");
				String nome = sc.next();

				System.out.println("Digite o curso:");
				String curso = sc.next();

				System.out.println("Digite a matricula:");
				Integer matricula = sc.nextInt();

				System.out.println("Digite o valor da primeira prova:");
				Double prova1 = sc.nextDouble();

				System.out.println("Digite o valor da primeira prova:");
				Double prova2 = sc.nextDouble();

				System.out.println("Digite o valor da primeira prova:");
				Double prova3 = sc.nextDouble();

				System.out.println("Digite o valor da primeira prova:");
				Double prova4 = sc.nextDouble();

				Aluno aluno = new Aluno(nome, curso, matricula, prova1, prova2, prova3, prova4);

				turma.cadastrarAluno(aluno);

				
			} else if (lup == 2) {
				System.out.println("\nSistema fechado com sucesso!");
				break;

			}

		}
	}
}
