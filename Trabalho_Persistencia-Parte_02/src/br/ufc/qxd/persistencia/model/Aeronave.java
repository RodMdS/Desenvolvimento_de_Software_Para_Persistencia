package br.ufc.qxd.persistencia.model;

public class Aeronave {
	
	private String aeronave_matricula;
	private String aeronave_operador_categoria;
	private String aeronave_tipo_veiculo;
	private String aeronave_fabricante;
	private String aeronave_modelo;
	private String aeronave_tipo_icao;
	private String aeronave_motor_tipo;
	private String aeronave_motor_quantidade;
	private String aeronave_pmd;
	private String aeronave_pmd_categoria;
	private String aeronave_assentos;
	private String aeronave_ano_fabricacao;
	private String aeronave_pais_fabricante;
	private String aeronave_pais_registro;
	private String aeronave_registro_categoria;
	private String aeronave_registro_segmento;
	private String aeronave_voo_origem;
	private String aeronave_voo_destino;
	private String aeronave_fase_operacao;
	private String aeronave_fase_operacao_icao;
	private String aeronave_tipo_operacao;
	private String aeronave_nivel_dano;
	private String total_fatalidades;
	private String aeronave_dia_extracao;
	
	public Aeronave() {}

	public Aeronave(String aeronave_matricula, String aeronave_operador_categoria, String aeronave_tipo_veiculo,
			String aeronave_fabricante, String aeronave_modelo, String aeronave_tipo_icao, String aeronave_motor_tipo,
			String aeronave_motor_quantidade, String aeronave_pmd, String aeronave_pmd_categoria,
			String aeronave_assentos, String aeronave_ano_fabricacao, String aeronave_pais_fabricante,
			String aeronave_pais_registro, String aeronave_registro_categoria, String aeronave_registro_segmento,
			String aeronave_voo_origem, String aeronave_voo_destino, String aeronave_fase_operacao,
			String aeronave_fase_operacao_icao, String aeronave_tipo_operacao, String aeronave_nivel_dano,
			String total_fatalidades, String aeronave_dia_extracao) {
		this.aeronave_matricula = aeronave_matricula;
		this.aeronave_operador_categoria = aeronave_operador_categoria;
		this.aeronave_tipo_veiculo = aeronave_tipo_veiculo;
		this.aeronave_fabricante = aeronave_fabricante;
		this.aeronave_modelo = aeronave_modelo;
		this.aeronave_tipo_icao = aeronave_tipo_icao;
		this.aeronave_motor_tipo = aeronave_motor_tipo;
		this.aeronave_motor_quantidade = aeronave_motor_quantidade;
		this.aeronave_pmd = aeronave_pmd;
		this.aeronave_pmd_categoria = aeronave_pmd_categoria;
		this.aeronave_assentos = aeronave_assentos;
		this.aeronave_ano_fabricacao = aeronave_ano_fabricacao;
		this.aeronave_pais_fabricante = aeronave_pais_fabricante;
		this.aeronave_pais_registro = aeronave_pais_registro;
		this.aeronave_registro_categoria = aeronave_registro_categoria;
		this.aeronave_registro_segmento = aeronave_registro_segmento;
		this.aeronave_voo_origem = aeronave_voo_origem;
		this.aeronave_voo_destino = aeronave_voo_destino;
		this.aeronave_fase_operacao = aeronave_fase_operacao;
		this.aeronave_fase_operacao_icao = aeronave_fase_operacao_icao;
		this.aeronave_tipo_operacao = aeronave_tipo_operacao;
		this.aeronave_nivel_dano = aeronave_nivel_dano;
		this.total_fatalidades = total_fatalidades;
		this.aeronave_dia_extracao = aeronave_dia_extracao;
	}

	public String getAeronave_matricula() {
		return aeronave_matricula;
	}

	public void setAeronave_matricula(String aeronave_matricula) {
		this.aeronave_matricula = aeronave_matricula;
	}

	public String getAeronave_operador_categoria() {
		return aeronave_operador_categoria;
	}

	public void setAeronave_operador_categoria(String aeronave_operador_categoria) {
		this.aeronave_operador_categoria = aeronave_operador_categoria;
	}

	public String getAeronave_tipo_veiculo() {
		return aeronave_tipo_veiculo;
	}

	public void setAeronave_tipo_veiculo(String aeronave_tipo_veiculo) {
		this.aeronave_tipo_veiculo = aeronave_tipo_veiculo;
	}

	public String getAeronave_fabricante() {
		return aeronave_fabricante;
	}

	public void setAeronave_fabricante(String aeronave_fabricante) {
		this.aeronave_fabricante = aeronave_fabricante;
	}

	public String getAeronave_modelo() {
		return aeronave_modelo;
	}

	public void setAeronave_modelo(String aeronave_modelo) {
		this.aeronave_modelo = aeronave_modelo;
	}

	public String getAeronave_tipo_icao() {
		return aeronave_tipo_icao;
	}

	public void setAeronave_tipo_icao(String aeronave_tipo_icao) {
		this.aeronave_tipo_icao = aeronave_tipo_icao;
	}

	public String getAeronave_motor_tipo() {
		return aeronave_motor_tipo;
	}

	public void setAeronave_motor_tipo(String aeronave_motor_tipo) {
		this.aeronave_motor_tipo = aeronave_motor_tipo;
	}

	public String getAeronave_motor_quantidade() {
		return aeronave_motor_quantidade;
	}

	public void setAeronave_motor_quantidade(String aeronave_motor_quantidade) {
		this.aeronave_motor_quantidade = aeronave_motor_quantidade;
	}

	public String getAeronave_pmd() {
		return aeronave_pmd;
	}

	public void setAeronave_pmd(String aeronave_pmd) {
		this.aeronave_pmd = aeronave_pmd;
	}

	public String getAeronave_pmd_categoria() {
		return aeronave_pmd_categoria;
	}

	public void setAeronave_pmd_categoria(String aeronave_pmd_categoria) {
		this.aeronave_pmd_categoria = aeronave_pmd_categoria;
	}

	public String getAeronave_assentos() {
		return aeronave_assentos;
	}

	public void setAeronave_assentos(String aeronave_assentos) {
		this.aeronave_assentos = aeronave_assentos;
	}

	public String getAeronave_ano_fabricacao() {
		return aeronave_ano_fabricacao;
	}

	public void setAeronave_ano_fabricacao(String aeronave_ano_fabricacao) {
		this.aeronave_ano_fabricacao = aeronave_ano_fabricacao;
	}

	public String getAeronave_pais_fabricante() {
		return aeronave_pais_fabricante;
	}

	public void setAeronave_pais_fabricante(String aeronave_pais_fabricante) {
		this.aeronave_pais_fabricante = aeronave_pais_fabricante;
	}

	public String getAeronave_pais_registro() {
		return aeronave_pais_registro;
	}

	public void setAeronave_pais_registro(String aeronave_pais_registro) {
		this.aeronave_pais_registro = aeronave_pais_registro;
	}

	public String getAeronave_registro_categoria() {
		return aeronave_registro_categoria;
	}

	public void setAeronave_registro_categoria(String aeronave_registro_categoria) {
		this.aeronave_registro_categoria = aeronave_registro_categoria;
	}

	public String getAeronave_registro_segmento() {
		return aeronave_registro_segmento;
	}

	public void setAeronave_registro_segmento(String aeronave_registro_segmento) {
		this.aeronave_registro_segmento = aeronave_registro_segmento;
	}

	public String getAeronave_voo_origem() {
		return aeronave_voo_origem;
	}

	public void setAeronave_voo_origem(String aeronave_voo_origem) {
		this.aeronave_voo_origem = aeronave_voo_origem;
	}

	public String getAeronave_voo_destino() {
		return aeronave_voo_destino;
	}

	public void setAeronave_voo_destino(String aeronave_voo_destino) {
		this.aeronave_voo_destino = aeronave_voo_destino;
	}

	public String getAeronave_fase_operacao() {
		return aeronave_fase_operacao;
	}

	public void setAeronave_fase_operacao(String aeronave_fase_operacao) {
		this.aeronave_fase_operacao = aeronave_fase_operacao;
	}

	public String getAeronave_fase_operacao_icao() {
		return aeronave_fase_operacao_icao;
	}

	public void setAeronave_fase_operacao_icao(String aeronave_fase_operacao_icao) {
		this.aeronave_fase_operacao_icao = aeronave_fase_operacao_icao;
	}

	public String getAeronave_tipo_operacao() {
		return aeronave_tipo_operacao;
	}

	public void setAeronave_tipo_operacao(String aeronave_tipo_operacao) {
		this.aeronave_tipo_operacao = aeronave_tipo_operacao;
	}

	public String getAeronave_nivel_dano() {
		return aeronave_nivel_dano;
	}

	public void setAeronave_nivel_dano(String aeronave_nivel_dano) {
		this.aeronave_nivel_dano = aeronave_nivel_dano;
	}

	public String getTotal_fatalidades() {
		return total_fatalidades;
	}

	public void setTotal_fatalidades(String total_fatalidades) {
		this.total_fatalidades = total_fatalidades;
	}

	public String getAeronave_dia_extracao() {
		return aeronave_dia_extracao;
	}

	public void setAeronave_dia_extracao(String aeronave_dia_extracao) {
		this.aeronave_dia_extracao = aeronave_dia_extracao;
	}

}
