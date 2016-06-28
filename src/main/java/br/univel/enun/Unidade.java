package br.univel.enun;

public enum Unidade {

	UNIDADE("Unidade"), KG("Kilo"), PACOTE("Pacote"), CAIXA("Caixa");

	private String unidade;

	Unidade(String unidade) {
		this.unidade = unidade;
	}

	public String getUnidade() {
		return unidade;
	}

}
