package com.estudo.gof;

public class ExpressaoFinal implements Expressao {
	private String dado;

	public ExpressaoFinal(String dado) {
		this.dado = dado;
	}

	public boolean entender(String contexto) {
		return (contexto.contains(dado));
	}
}
