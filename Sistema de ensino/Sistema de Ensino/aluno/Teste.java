package aluno;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		
		PlataformaEnsino fatec = new PlataformaEnsino();
		
		Pessoa maria = new Pessoa("Maria", "12345", "maria@maria");
		
		fatec.cadastrarPessoa(maria);
		
		
		assertEquals(fatec.getPessoas().size(), 1);
		
		assertEquals(fatec.getPessoas().get(0).getNome(), "Maria");
		
		Pessoa joao = new Pessoa("Joao", "123", "joao@joao");
		
		fatec.cadastrarPessoa(joao);
		
		assertEquals(fatec.getPessoas().size(), 2);
		
		
		assertEquals(fatec.getPessoas().get(1).getSenha(), "123");
		
	}

}