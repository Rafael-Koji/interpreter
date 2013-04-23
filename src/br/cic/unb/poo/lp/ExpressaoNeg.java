package br.cic.unb.poo.lp;

public class ExpressaoNeg extends Expressao{
	private Expressao expressao;
	
	public ExpressaoNeg(Expressao valor){
		expressao = valor;
	}
	
	public Expressao avaliar(){
		return new Valor(-expressao.getValor());
	}

}
