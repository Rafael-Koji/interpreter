package br.cic.unb.poo.lp;


public class Valor extends Expressao {

	private int valor;
	
	public Valor(int valor){
		this.valor = valor;
	}
	
	public Expressao avaliar(){
		return this;
	}
	
	public int getValor(){
		return this.valor;
	}
		
}
