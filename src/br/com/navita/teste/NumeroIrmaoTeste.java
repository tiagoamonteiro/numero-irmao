package br.com.navita.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.navita.exercicio.NumeroIrmao;

public class NumeroIrmaoTeste {
	
	@Test
	public void teste() {
		int n1 = 123;
		int n2 = 2348;
		int n3 = 533;
		int n4 = 121255542;
		
		int retornoEsperadoN1 = 321;
		int retornoEsperadoN2 = 8432;
		int retornoEsperadoN3 = 533;
		int retornoEsperadoN4 = -1;
		
		NumeroIrmao numeroIrmao = new NumeroIrmao();
		
		int resultadoN1 = numeroIrmao.solucao(n1);
		assertEquals(retornoEsperadoN1, resultadoN1);
		
		int resultadoN2 = numeroIrmao.solucao(n2);
		assertEquals(retornoEsperadoN2, resultadoN2);
		
		int resultadoN3 = numeroIrmao.solucao(n3);
		assertEquals(retornoEsperadoN3, resultadoN3);
		
		int resultadoN4 = numeroIrmao.solucao(n4);
		assertEquals(retornoEsperadoN4, resultadoN4);
	}

}
