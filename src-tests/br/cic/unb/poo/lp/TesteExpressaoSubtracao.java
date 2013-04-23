package br.cic.unb.poo.lp;

import junit.framework.TestCase;

public class TesteExpressaoSubtracao extends TestCase{
	
	public void testSubtracao() {
		Expressao valor10 = new Valor(10);
		Expressao valor5 = new Valor(5);
		
		Expressao subtracao = new ExpressaoSubtracao(valor10, valor5);
		
		Expressao resultado = subtracao.avaliar();
		
		assertEquals(5, resultado.getValor());
	}
	

}
