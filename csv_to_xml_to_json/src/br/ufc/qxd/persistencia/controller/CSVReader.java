package br.ufc.qxd.persistencia.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CSVReader {
	
	private static final String DIRECTORY = "files/";
	private static final String OUT = "q01.xml";
	private Document doc;
	private Transformer transformer;
	
	public CSVReader() {
		try {
			doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			transformer = TransformerFactory.newInstance().newTransformer();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		}
	}
	
	private Element getLineFromAnothersCSVByField(String file_name, String field) {
		String line = "";
		Element element = null;
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		File file = null;
		if(file_name.equals("recomendacao")) file = new File("recomendacoes.csv");
		else if(file_name.equals("aeronave")) file = new File("aeronaves.csv");
		else file = new File("fatores_contribuintes.csv");
		
		try {
			is = new FileInputStream(DIRECTORY + file);
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
		    
		    String header = br.readLine().trim();
		    String[] csv_fields = header.split("~");
		    
		    boolean found = false;
		    while(br.ready()) {
		    	line = br.readLine().trim();
		    	if(line.split("~")[0].equals('"' + field + '"')) {
		    		found = true;
		    		break;
		    	}
		    }
		    
		    if(found) {
		    	String[] content = line.trim().split("~");
		    	
		    	element = doc.createElement(file_name);
		    	Attr atributo = doc.createAttribute(csv_fields[1]
		    			.substring(1, csv_fields[1].length() - 1)
		    			/*.replaceAll("_", "")*/);
		    	atributo.setValue(content[1]
		    			.substring(1, content[1].length() - 1));
		    	element.setAttributeNode(atributo);
		    	
		    	for(int i = 2; i < csv_fields.length; i++) {
		    		Element elem = doc.createElement(csv_fields[i]
			    			.substring(1, csv_fields[i].length() - 1)
			    			/*.replaceAll("_", "")*/);
			    	elem.appendChild(doc.createTextNode(content[i]
			    			.substring(1, content[i].length() - 1)));
			    	element.appendChild(elem);
		    	}
		    } else {
		    	element = doc.createElement(file_name);
		    	Attr atributo = doc.createAttribute(csv_fields[1]
		    			.substring(1, csv_fields[1].length() - 1)
		    			/*.replaceAll("_", "")*/);
		    	atributo.setValue("");
		    	element.setAttributeNode(atributo);
		    	
		    	for(int i = 2; i < csv_fields.length; i++) {
		    		Element elem = doc.createElement(csv_fields[i]
			    			.substring(1, csv_fields[i].length() - 1)
			    			/*.replaceAll("_", "")*/);
			    	elem.appendChild(doc.createTextNode(""));
			    	element.appendChild(elem);
		    	}
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	    
	    return element;
	}
	
	public void writeOcorrenciasInXML() {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			is = new FileInputStream(DIRECTORY + new File("ocorrencias.csv"));
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
		    
		    String ignorar = br.readLine().trim();
		    String[] csv_fields = ignorar.split(",");
		    
//		    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//		    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//		    Document doc = docBuilder.newDocument();
		    
		    Element rootElement = doc.createElement("ocorrencias");
		    doc.appendChild(rootElement);
		    
		    while(br.ready()) {
		    	String ocorrencia_line = br.readLine();
		    	String[] content = ocorrencia_line.split(",");
		    	
		    	Element ocorrencia = doc.createElement("ocorrencia");
		    	rootElement.appendChild(ocorrencia);
		    	
		    	Attr codigo_ocorrencia = doc.createAttribute("codigo");
		    	codigo_ocorrencia.setValue(content[0]);
		    	ocorrencia.setAttributeNode(codigo_ocorrencia);
		    	
		    	for(int i = 1; i < csv_fields.length; i++) {
		    		Element element = doc.createElement(csv_fields[i]);
			    	element.appendChild(doc.createTextNode(content[i]));
			    	ocorrencia.appendChild(element);
		    	}
		    	
		    	
		    	Element airplane = getLineFromAnothersCSVByField("aeronave", content[0]);
		    	Element recommendation = getLineFromAnothersCSVByField("recomendacao", content[0]);
		    	Element contributing_factor = getLineFromAnothersCSVByField("fator_contribuinte", 
		    			content[0]);
		    	

		    	ocorrencia.appendChild(airplane);
		    	ocorrencia.appendChild(recommendation);
		    	ocorrencia.appendChild(contributing_factor);
		    	
		    	/**
		    	 * System.out.println("Ocorrencia: " + ocorrencia_line);
		    	 * System.out.println("Aerovane: " + airplane_line);
		    	 * System.out.println("Fatores contribuintes: " + contributing_factor_line);
		    	 * System.out.println("Recomendação: " + recommendation_line);
		    	 * break;
		    	 */
		    }
		    
//		    TransformerFactory transformerFactory = TransformerFactory.newInstance();
//		    Transformer transformer = transformerFactory.newTransformer();
		    DOMSource source = new DOMSource(doc);
		    StreamResult result = new StreamResult(DIRECTORY + new File(OUT));
		    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
		    transformer.transform(source, result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
		System.out.println("FIM");
	}

}
