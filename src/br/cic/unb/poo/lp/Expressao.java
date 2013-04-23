package br.cic.unb.poo.lp;

public abstract class Expressao {

	public abstract Expressao avaliar();
	
	public int getValor(){
		return avaliar().getValor();
	}
	
}
