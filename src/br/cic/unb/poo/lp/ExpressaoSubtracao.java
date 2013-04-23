package br.cic.unb.poo.lp;

public class ExpressaoSubtracao extends ExpBin {
	
	public ExpressaoSubtracao(Expressao lhs, Expressao rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public Expressao avaliar() {
		return new Valor(lhs.getValor() - rhs.getValor());
	}

}
