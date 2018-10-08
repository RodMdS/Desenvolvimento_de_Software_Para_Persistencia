package br.ufc.qxd.persistencia.model;

public class FatorContribuinte {
	
	private String fator_nome;
	private String fator_aspecto;
	private String fator_condicionante;
	private String fator_area;
	private String fator_detalhe_fator;
	private String fator_dia_extracao;

	public FatorContribuinte() {}

	public FatorContribuinte(String fator_nome, String fator_aspecto, String fator_condicionante, String fator_area,
			String fator_detalhe_fator, String fator_dia_extracao) {
		this.fator_nome = fator_nome;
		this.fator_aspecto = fator_aspecto;
		this.fator_condicionante = fator_condicionante;
		this.fator_area = fator_area;
		this.fator_detalhe_fator = fator_detalhe_fator;
		this.fator_dia_extracao = fator_dia_extracao;
	}

	public String getFator_nome() {
		return fator_nome;
	}

	public void setFator_nome(String fator_nome) {
		this.fator_nome = fator_nome;
	}

	public String getFator_aspecto() {
		return fator_aspecto;
	}

	public void setFator_aspecto(String fator_aspecto) {
		this.fator_aspecto = fator_aspecto;
	}

	public String getFator_condicionante() {
		return fator_condicionante;
	}

	public void setFator_condicionante(String fator_condicionante) {
		this.fator_condicionante = fator_condicionante;
	}

	public String getFator_area() {
		return fator_area;
	}

	public void setFator_area(String fator_area) {
		this.fator_area = fator_area;
	}

	public String getFator_detalhe_fator() {
		return fator_detalhe_fator;
	}

	public void setFator_detalhe_fator(String fator_detalhe_fator) {
		this.fator_detalhe_fator = fator_detalhe_fator;
	}

	public String getFator_dia_extracao() {
		return fator_dia_extracao;
	}

	public void setFator_dia_extracao(String fator_dia_extracao) {
		this.fator_dia_extracao = fator_dia_extracao;
	}
	
}
