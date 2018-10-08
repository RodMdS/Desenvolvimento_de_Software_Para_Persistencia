package br.ufc.qxd.persistencia.model;

public class Ocorrencia {

	private String codigo;
	private String ocorrencia_classificacao;
	private String ocorrencia_tipo;
	private String ocorrencia_tipo_categoria;
	private String ocorrencia_tipo_icao;
	private String ocorrencia_latitude;
	private String ocorrencia_longitude;
	private String ocorrencia_cidade;
	private String ocorrencia_uf;
	private String ocorrencia_pais;
	private String ocorrencia_aerodromo;
	private String ocorrencia_dia;
	private String ocorrencia_horario;
	private String investigacao_aeronave_liberada;
	private String investigacao_status;
	private String divulgacao_relatorio_numero;
	private String divulgacao_relatorio_publicado;
	private String divulgacao_dia_publicacao;
	private String total_recomendacoes;
	private String total_aeronaves_envolvidas;
	private String ocorrencia_saida_pista;
	private String ocorrencia_dia_extracao;
	private Aeronave aeronave;
	private Recomendacao recomendacao;
	private FatorContribuinte fatorContribuinte;
	
	public Ocorrencia() {}

	public Ocorrencia(String codigo, String ocorrencia_classificacao, String ocorrencia_tipo,
			String ocorrencia_tipo_categoria, String ocorrencia_tipo_icao, String ocorrencia_latitude,
			String ocorrencia_longitude, String ocorrencia_cidade, String ocorrencia_uf, String ocorrencia_pais,
			String ocorrencia_aerodromo, String ocorrencia_dia, String ocorrencia_horario,
			String investigacao_aeronave_liberada, String investigacao_status, String divulgacao_relatorio_numero,
			String divulgacao_relatorio_publicado, String divulgacao_dia_publicacao, String total_recomendacoes,
			String total_aeronaves_envolvidas, String ocorrencia_saida_pista, String ocorrencia_dia_extracao,
			Aeronave aeronave, Recomendacao recomendacao, FatorContribuinte fatorContribuinte) {
		this.codigo = codigo;
		this.ocorrencia_classificacao = ocorrencia_classificacao;
		this.ocorrencia_tipo = ocorrencia_tipo;
		this.ocorrencia_tipo_categoria = ocorrencia_tipo_categoria;
		this.ocorrencia_tipo_icao = ocorrencia_tipo_icao;
		this.ocorrencia_latitude = ocorrencia_latitude;
		this.ocorrencia_longitude = ocorrencia_longitude;
		this.ocorrencia_cidade = ocorrencia_cidade;
		this.ocorrencia_uf = ocorrencia_uf;
		this.ocorrencia_pais = ocorrencia_pais;
		this.ocorrencia_aerodromo = ocorrencia_aerodromo;
		this.ocorrencia_dia = ocorrencia_dia;
		this.ocorrencia_horario = ocorrencia_horario;
		this.investigacao_aeronave_liberada = investigacao_aeronave_liberada;
		this.investigacao_status = investigacao_status;
		this.divulgacao_relatorio_numero = divulgacao_relatorio_numero;
		this.divulgacao_relatorio_publicado = divulgacao_relatorio_publicado;
		this.divulgacao_dia_publicacao = divulgacao_dia_publicacao;
		this.total_recomendacoes = total_recomendacoes;
		this.total_aeronaves_envolvidas = total_aeronaves_envolvidas;
		this.ocorrencia_saida_pista = ocorrencia_saida_pista;
		this.ocorrencia_dia_extracao = ocorrencia_dia_extracao;
		this.aeronave = aeronave;
		this.recomendacao = recomendacao;
		this.fatorContribuinte = fatorContribuinte;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getOcorrencia_classificacao() {
		return ocorrencia_classificacao;
	}

	public void setOcorrencia_classificacao(String ocorrencia_classificacao) {
		this.ocorrencia_classificacao = ocorrencia_classificacao;
	}

	public String getOcorrencia_tipo() {
		return ocorrencia_tipo;
	}

	public void setOcorrencia_tipo(String ocorrencia_tipo) {
		this.ocorrencia_tipo = ocorrencia_tipo;
	}

	public String getOcorrencia_tipo_categoria() {
		return ocorrencia_tipo_categoria;
	}

	public void setOcorrencia_tipo_categoria(String ocorrencia_tipo_categoria) {
		this.ocorrencia_tipo_categoria = ocorrencia_tipo_categoria;
	}

	public String getOcorrencia_tipo_icao() {
		return ocorrencia_tipo_icao;
	}

	public void setOcorrencia_tipo_icao(String ocorrencia_tipo_icao) {
		this.ocorrencia_tipo_icao = ocorrencia_tipo_icao;
	}

	public String getOcorrencia_latitude() {
		return ocorrencia_latitude;
	}

	public void setOcorrencia_latitude(String ocorrencia_latitude) {
		this.ocorrencia_latitude = ocorrencia_latitude;
	}

	public String getOcorrencia_longitude() {
		return ocorrencia_longitude;
	}

	public void setOcorrencia_longitude(String ocorrencia_longitude) {
		this.ocorrencia_longitude = ocorrencia_longitude;
	}

	public String getOcorrencia_cidade() {
		return ocorrencia_cidade;
	}

	public void setOcorrencia_cidade(String ocorrencia_cidade) {
		this.ocorrencia_cidade = ocorrencia_cidade;
	}

	public String getOcorrencia_uf() {
		return ocorrencia_uf;
	}

	public void setOcorrencia_uf(String ocorrencia_uf) {
		this.ocorrencia_uf = ocorrencia_uf;
	}

	public String getOcorrencia_pais() {
		return ocorrencia_pais;
	}

	public void setOcorrencia_pais(String ocorrencia_pais) {
		this.ocorrencia_pais = ocorrencia_pais;
	}

	public String getOcorrencia_aerodromo() {
		return ocorrencia_aerodromo;
	}

	public void setOcorrencia_aerodromo(String ocorrencia_aerodromo) {
		this.ocorrencia_aerodromo = ocorrencia_aerodromo;
	}

	public String getOcorrencia_dia() {
		return ocorrencia_dia;
	}

	public void setOcorrencia_dia(String ocorrencia_dia) {
		this.ocorrencia_dia = ocorrencia_dia;
	}

	public String getOcorrencia_horario() {
		return ocorrencia_horario;
	}

	public void setOcorrencia_horario(String ocorrencia_horario) {
		this.ocorrencia_horario = ocorrencia_horario;
	}

	public String getInvestigacao_aeronave_liberada() {
		return investigacao_aeronave_liberada;
	}

	public void setInvestigacao_aeronave_liberada(String investigacao_aeronave_liberada) {
		this.investigacao_aeronave_liberada = investigacao_aeronave_liberada;
	}

	public String getInvestigacao_status() {
		return investigacao_status;
	}

	public void setInvestigacao_status(String investigacao_status) {
		this.investigacao_status = investigacao_status;
	}

	public String getDivulgacao_relatorio_numero() {
		return divulgacao_relatorio_numero;
	}

	public void setDivulgacao_relatorio_numero(String divulgacao_relatorio_numero) {
		this.divulgacao_relatorio_numero = divulgacao_relatorio_numero;
	}

	public String getDivulgacao_relatorio_publicado() {
		return divulgacao_relatorio_publicado;
	}

	public void setDivulgacao_relatorio_publicado(String divulgacao_relatorio_publicado) {
		this.divulgacao_relatorio_publicado = divulgacao_relatorio_publicado;
	}

	public String getDivulgacao_dia_publicacao() {
		return divulgacao_dia_publicacao;
	}

	public void setDivulgacao_dia_publicacao(String divulgacao_dia_publicacao) {
		this.divulgacao_dia_publicacao = divulgacao_dia_publicacao;
	}

	public String getTotal_recomendacoes() {
		return total_recomendacoes;
	}

	public void setTotal_recomendacoes(String total_recomendacoes) {
		this.total_recomendacoes = total_recomendacoes;
	}

	public String getTotal_aeronaves_envolvidas() {
		return total_aeronaves_envolvidas;
	}

	public void setTotal_aeronaves_envolvidas(String total_aeronaves_envolvidas) {
		this.total_aeronaves_envolvidas = total_aeronaves_envolvidas;
	}

	public String getOcorrencia_saida_pista() {
		return ocorrencia_saida_pista;
	}

	public void setOcorrencia_saida_pista(String ocorrencia_saida_pista) {
		this.ocorrencia_saida_pista = ocorrencia_saida_pista;
	}

	public String getOcorrencia_dia_extracao() {
		return ocorrencia_dia_extracao;
	}

	public void setOcorrencia_dia_extracao(String ocorrencia_dia_extracao) {
		this.ocorrencia_dia_extracao = ocorrencia_dia_extracao;
	}

	public Aeronave getAeronave() {
		return aeronave;
	}

	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}

	public Recomendacao getRecomendacao() {
		return recomendacao;
	}

	public void setRecomendacao(Recomendacao recomendacao) {
		this.recomendacao = recomendacao;
	}

	public FatorContribuinte getFatorContribuinte() {
		return fatorContribuinte;
	}

	public void setFatorContribuinte(FatorContribuinte fatorContribuinte) {
		this.fatorContribuinte = fatorContribuinte;
	}
	
}
