package br.cic.unb.poo.lp;

import junit.framework.TestCase;

public class TesteExpressaoSoma extends TestCase {

	public void testSoma() {
		Expressao valor5 = new Valor(5);
		Expressao valor10 = new Valor(10);
		
		Expressao soma = new ExpressaoSoma(valor5, valor10);
		
		Expressao resultado = soma.avaliar();
	
		assertEquals(15, resultado.getValor());
	
	}
}
