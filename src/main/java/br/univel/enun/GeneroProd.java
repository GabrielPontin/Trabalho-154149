package br.univel.enun;

public enum GeneroProd {

	Moveis("Moveis"), Eletrodomesticos("Eletrodomesticos"), Eletronicos(
			"Eletronicos");

	private String genero;

	GeneroProd(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

}
