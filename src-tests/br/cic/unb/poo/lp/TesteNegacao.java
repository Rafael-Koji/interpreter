package br.cic.unb.poo.lp;

import junit.framework.TestCase;

public class TesteNegacao extends TestCase {
	public void testNeg(){
		Expressao valor = new Valor(5);
		Expressao valorNeg = new Valor(-6);
		Expressao resultado = new ExpressaoNeg(valor);
		Expressao resultadoNeg = new ExpressaoNeg(valorNeg);
		
		assertEquals(-5, resultado.getValor());
		assertEquals(6, resultadoNeg.getValor());
	}
}
