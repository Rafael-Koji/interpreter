package br.cic.unb.poo.lp;

public class ExpressaoSoma extends ExpBin {
	
	public ExpressaoSoma(Expressao lhs, Expressao rhs){
		super(lhs, rhs);
	}
	
	public Expressao avaliar() {
		return new Valor(lhs.getValor() + rhs.getValor());
	}

}
