package br.univel.enun;

public enum Uf {

	AP(0, "Amapa"),
	AM(1, "Amazonas"),
	BA(2, "Bahia"),
	CE(3, "Ceara"),
	DF(4, "Distrito Federal"),
	ES(5, "Espirito Santo"),
	GO(6, "Goias"),
	MA(7, "Maranhao"),
	MT(8, "Mato Grosso"),
	MS(9, "Mato Grosso do Sul"),
	MG(10, "Minas Gerais"),
	PA(11, "Para"),
	PB(12, "Paraiba"),
	PR(13, "Parana"),
	PE(14, "Pernambuco"),
	PI(15, "Piaui"),
	RJ(16, "Rio de Janeiro"),
	RN(17, "Rio Grande do Norte"),
	RS(18, "Rio Grande do Sul"),
	RO(19, "Rondonia"),
	RR(20, "Roraima"),
	SC(21, "Santa Catarina"),
	SP(22, "Sao Paulo"),
	SE(23, "Sergipe"),
	TO(24, "Tocantins");


	private String descricao;


	private Uf(Integer ordinal, String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return getDescricao();
	}

}
