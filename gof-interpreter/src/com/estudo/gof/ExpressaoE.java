package com.estudo.gof;

public class ExpressaoE implements Expressao {
	private Expressao expr1 = null;
	private Expressao expr2 = null;

	public ExpressaoE(Expressao expr1, Expressao expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	public boolean entender(String contexto) {
		return expr1.entender(contexto) && expr2.entender(contexto);
	}
}
