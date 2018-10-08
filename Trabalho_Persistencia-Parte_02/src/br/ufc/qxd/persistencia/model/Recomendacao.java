package br.ufc.qxd.persistencia.model;

public class Recomendacao {
	
	private String recomendacao_numero;
	private String recomendacao_dia_assinatura;
	private String recomendacao_dia_encaminhamento;
	private String recomendacao_feedback;
	private String recomendacao_conteudo;
	private String recomendacao_status;
	private String recomendacao_destinatario_sigla;
	private String recomendacao_destinatario_nome;
	private String dia_extracao_recomendacao;
	
	public Recomendacao() {}

	public Recomendacao(String recomendacao_numero, String recomendacao_dia_assinatura,
			String recomendacao_dia_encaminhamento, String recomendacao_feedback, String recomendacao_conteudo,
			String recomendacao_status, String recomendacao_destinatario_sigla, String recomendacao_destinatario_nome,
			String dia_extracao_recomendacao) {
		this.recomendacao_numero = recomendacao_numero;
		this.recomendacao_dia_assinatura = recomendacao_dia_assinatura;
		this.recomendacao_dia_encaminhamento = recomendacao_dia_encaminhamento;
		this.recomendacao_feedback = recomendacao_feedback;
		this.recomendacao_conteudo = recomendacao_conteudo;
		this.recomendacao_status = recomendacao_status;
		this.recomendacao_destinatario_sigla = recomendacao_destinatario_sigla;
		this.recomendacao_destinatario_nome = recomendacao_destinatario_nome;
		this.dia_extracao_recomendacao = dia_extracao_recomendacao;
	}

	public String getRecomendacao_numero() {
		return recomendacao_numero;
	}

	public void setRecomendacao_numero(String recomendacao_numero) {
		this.recomendacao_numero = recomendacao_numero;
	}

	public String getRecomendacao_dia_assinatura() {
		return recomendacao_dia_assinatura;
	}

	public void setRecomendacao_dia_assinatura(String recomendacao_dia_assinatura) {
		this.recomendacao_dia_assinatura = recomendacao_dia_assinatura;
	}

	public String getRecomendacao_dia_encaminhamento() {
		return recomendacao_dia_encaminhamento;
	}

	public void setRecomendacao_dia_encaminhamento(String recomendacao_dia_encaminhamento) {
		this.recomendacao_dia_encaminhamento = recomendacao_dia_encaminhamento;
	}

	public String getRecomendacao_feedback() {
		return recomendacao_feedback;
	}

	public void setRecomendacao_feedback(String recomendacao_feedback) {
		this.recomendacao_feedback = recomendacao_feedback;
	}

	public String getRecomendacao_conteudo() {
		return recomendacao_conteudo;
	}

	public void setRecomendacao_conteudo(String recomendacao_conteudo) {
		this.recomendacao_conteudo = recomendacao_conteudo;
	}

	public String getRecomendacao_status() {
		return recomendacao_status;
	}

	public void setRecomendacao_status(String recomendacao_status) {
		this.recomendacao_status = recomendacao_status;
	}

	public String getRecomendacao_destinatario_sigla() {
		return recomendacao_destinatario_sigla;
	}

	public void setRecomendacao_destinatario_sigla(String recomendacao_destinatario_sigla) {
		this.recomendacao_destinatario_sigla = recomendacao_destinatario_sigla;
	}

	public String getRecomendacao_destinatario_nome() {
		return recomendacao_destinatario_nome;
	}

	public void setRecomendacao_destinatario_nome(String recomendacao_destinatario_nome) {
		this.recomendacao_destinatario_nome = recomendacao_destinatario_nome;
	}

	public String getDia_extracao_recomendacao() {
		return dia_extracao_recomendacao;
	}

	public void setDia_extracao_recomendacao(String dia_extracao_recomendacao) {
		this.dia_extracao_recomendacao = dia_extracao_recomendacao;
	}

}
