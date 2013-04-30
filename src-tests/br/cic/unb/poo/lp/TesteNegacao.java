package br.cic.unb.poo.lp;

import junit.framework.TestCase;

public class TesteNegacao extends TestCase {
	public void testNeg(){
		Expressao valor = new Valor(5);
		Expressao valorNeg = new Valor(-6);
		Expressao resultado = new ExpressaoNegacao(valor);
		Expressao resultadoNeg = new ExpressaoNegacao(valorNeg);
		
		assertEquals(-5, resultado.getValor());
		assertEquals(6, resultadoNeg.getValor());
	}
}
