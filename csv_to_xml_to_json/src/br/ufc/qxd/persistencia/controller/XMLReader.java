package br.ufc.qxd.persistencia.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.ufc.qxd.persistencia.model.Aeronave;
import br.ufc.qxd.persistencia.model.FatorContribuinte;
import br.ufc.qxd.persistencia.model.Ocorrencia;
import br.ufc.qxd.persistencia.model.Recomendacao;

public class XMLReader extends DefaultHandler {

	private static final String DIRECTORY = "files/";
	private static final String OUT = "q03.json";
	
	private String temp;
	
	private Ocorrencia ocorrencia;
	private Aeronave aeronave;
	private Recomendacao recomendacao;
	private FatorContribuinte fatorContribuinte;
	
	private List<Ocorrencia> ocorrencias;
	
	public XMLReader() {
		ocorrencias = new ArrayList<>();
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			parser.parse(DIRECTORY + "q01.xml", this);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("INICIANDO DOCUMENTO");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("TERMINANDO DOCUMENTO");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		temp = "";
		
		if(qName.equals("ocorrencia")) {
			ocorrencia = new Ocorrencia();
			ocorrencia.setCodigo(attributes.getValue(0));
		} else if(qName.equals("aeronave")) {
			aeronave = new Aeronave();
			aeronave.setAeronave_matricula(attributes.getValue(0));
		} else if(qName.equals("recomendacao")) {
			recomendacao = new Recomendacao();
			recomendacao.setRecomendacao_numero(attributes.getValue(0));
		} else if(qName.equals("fator_contribuinte")) {
			fatorContribuinte = new FatorContribuinte();
			fatorContribuinte.setFator_nome(attributes.getValue(0));
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("ocorrencia")) {
			ocorrencias.add(ocorrencia);
		} else if(qName.equals("ocorrencia_classificacao")) {
			ocorrencia.setOcorrencia_classificacao(temp);
		} else if(qName.equals("ocorrencia_tipo")) {
			ocorrencia.setOcorrencia_tipo(temp);
		} else if(qName.equals("ocorrencia_tipo_categoria")) {
			ocorrencia.setOcorrencia_tipo_categoria(temp);
		} else if(qName.equals("ocorrencia_tipo_icao")) {
			ocorrencia.setOcorrencia_tipo_icao(temp);
		} else if(qName.equals("ocorrencia_latitude")) {
			ocorrencia.setOcorrencia_latitude(temp);
		} else if(qName.equals("ocorrencia_longitude")) {
			ocorrencia.setOcorrencia_longitude(temp);
		} else if(qName.equals("ocorrencia_cidade")) {
			ocorrencia.setOcorrencia_cidade(temp);
		} else if(qName.equals("ocorrencia_uf")) {
			ocorrencia.setOcorrencia_uf(temp);
		} else if(qName.equals("ocorrencia_pais")) {
			ocorrencia.setOcorrencia_pais(temp);
		} else if(qName.equals("ocorrencia_aerodromo")) {
			ocorrencia.setOcorrencia_aerodromo(temp);
		} else if(qName.equals("ocorrencia_dia")) {
			ocorrencia.setOcorrencia_dia(temp);
		} else if(qName.equals("ocorrencia_horario")) {
			ocorrencia.setOcorrencia_horario(temp);
		} else if(qName.equals("investigacao_aeronave_liberada")) {
			ocorrencia.setInvestigacao_aeronave_liberada(temp);
		} else if(qName.equals("investigacao_status")) {
			ocorrencia.setInvestigacao_status(temp);
		} else if(qName.equals("divulgacao_relatorio_numero")) {
			ocorrencia.setDivulgacao_relatorio_numero(temp);
		} else if(qName.equals("divulgacao_relatorio_publicado")) {
			ocorrencia.setDivulgacao_relatorio_publicado(temp);
		} else if(qName.equals("divulgacao_dia_publicacao")) {
			ocorrencia.setDivulgacao_dia_publicacao(temp);
		} else if(qName.equals("total_recomendacoes")) {
			ocorrencia.setTotal_recomendacoes(temp);
		} else if(qName.equals("total_aeronaves_envolvidas")) {
			ocorrencia.setTotal_aeronaves_envolvidas(temp);
		} else if(qName.equals("ocorrencia_saida_pista")) {
			ocorrencia.setOcorrencia_saida_pista(temp);
		} else if(qName.equals("ocorrencia_dia_extracao")) {
			ocorrencia.setOcorrencia_dia_extracao(temp);
		} else if(qName.equals("aeronave")) {
			ocorrencia.setAeronave(aeronave);
		} else if(qName.equals("aeronave_operador_categoria")) {
			aeronave.setAeronave_operador_categoria(temp);
		} else if(qName.equals("aeronave_tipo_veiculo")) {
			aeronave.setAeronave_tipo_veiculo(temp);
		} else if(qName.equals("aeronave_fabricante")) {
			aeronave.setAeronave_fabricante(temp);
		} else if(qName.equals("aeronave_modelo")) {
			aeronave.setAeronave_modelo(temp);
		} else if(qName.equals("aeronave_tipo_icao")) {
			aeronave.setAeronave_tipo_icao(temp);
		} else if(qName.equals("aeronave_motor_tipo")) {
			aeronave.setAeronave_motor_tipo(temp);
		} else if(qName.equals("aeronave_motor_quantidade")) {
			aeronave.setAeronave_motor_quantidade(temp);
		} else if(qName.equals("aeronave_pmd")) {
			aeronave.setAeronave_pmd(temp);
		} else if(qName.equals("aeronave_pmd_categoria")) {
			aeronave.setAeronave_pmd_categoria(temp);
		} else if(qName.equals("aeronave_assentos")) {
			aeronave.setAeronave_assentos(temp);
		} else if(qName.equals("aeronave_ano_fabricacao")) {
			aeronave.setAeronave_ano_fabricacao(temp);
		} else if(qName.equals("aeronave_pais_fabricante")) {
			aeronave.setAeronave_pais_fabricante(temp);
		} else if(qName.equals("aeronave_pais_resgistro")) {
			aeronave.setAeronave_pais_registro(temp);
		} else if(qName.equals("aeronave_registro_categoria")) {
			aeronave.setAeronave_registro_categoria(temp);
		} else if(qName.equals("aeronave_registro_segmento")) {
			aeronave.setAeronave_registro_segmento(temp);
		} else if(qName.equals("aeronave_voo_origem")) {
			aeronave.setAeronave_voo_origem(temp);
		} else if(qName.equals("aeronave_voo_destino")) {
			aeronave.setAeronave_voo_destino(temp);
		} else if(qName.equals("aeronave_fase_operacao")) {
			aeronave.setAeronave_fase_operacao(temp);
		} else if(qName.equals("aeronave_fase_operacao_icao")) {
			aeronave.setAeronave_fase_operacao_icao(temp);
		} else if(qName.equals("aeronave_tipo_operacao")) {
			aeronave.setAeronave_tipo_operacao(temp);
		} else if(qName.equals("aeronave_nivel_dano")) {
			aeronave.setAeronave_nivel_dano(temp);
		} else if(qName.equals("total_fatalidades")) {
			aeronave.setTotal_fatalidades(temp);
		} else if(qName.equals("aeronave_dia_extracao")) {
			aeronave.setAeronave_dia_extracao(temp);
		} else if(qName.equals("recomendacao")) {
			ocorrencia.setRecomendacao(recomendacao);
		} else if(qName.equals("recomendacao_dia_assinatura")) {
			recomendacao.setRecomendacao_dia_assinatura(temp);
		} else if(qName.equals("recomendacao_dia_encaminhamento")) {
			recomendacao.setRecomendacao_dia_encaminhamento(temp);
		} else if(qName.equals("recomendacao_feedback")) {
			recomendacao.setRecomendacao_feedback(temp);
		} else if(qName.equals("recomendacao_conteudo")) {
			recomendacao.setRecomendacao_conteudo(temp);
		} else if(qName.equals("recomendacao_status")) {
			recomendacao.setRecomendacao_status(temp);
		} else if(qName.equals("recomendacao_destinatario_sigla")) {
			recomendacao.setRecomendacao_destinatario_sigla(temp);
		} else if(qName.equals("recomendacao_destinatario_nome")) {
			recomendacao.setRecomendacao_destinatario_sigla(temp);
		} else if(qName.equals("dia_extracao_recomendacao")) {
			recomendacao.setDia_extracao_recomendacao(temp);
		} else if(qName.equals("fator_contribuinte")) {
			ocorrencia.setFatorContribuinte(fatorContribuinte);
		} else if(qName.equals("fator_aspecto")) {
			fatorContribuinte.setFator_aspecto(temp);
		} else if(qName.equals("fator_condicionante")) {
			fatorContribuinte.setFator_condicionante(temp);
		} else if(qName.equals("fator_area")) {
			fatorContribuinte.setFator_area(temp);
		} else if(qName.equals("fator_detalhe_fator")) {
			fatorContribuinte.setFator_detalhe_fator(temp);
		} else if(qName.equals("fator_dia_extracao")) {
			fatorContribuinte.setFator_dia_extracao(temp);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		temp = new String(ch, start, length);
	}
	
	public void writeInJson() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File(DIRECTORY + OUT), ocorrencias);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
