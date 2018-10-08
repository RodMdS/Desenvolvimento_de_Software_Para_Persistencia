package br.ufc.qxd.persistencia.view;

import br.ufc.qxd.persistencia.controller.CSVReader;
import br.ufc.qxd.persistencia.controller.XMLReader;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Começou...");
		
		long inicio = System.currentTimeMillis();
		
		CSVReader reader = new CSVReader();
		reader.writeOcorrenciasInXML();
		
		//System.out.println("XML criado");
		
		XMLReader xmlReader = new XMLReader();
		xmlReader.writeInJson();
		
		System.out.println((System.currentTimeMillis() - inicio) + " milisegundos.");
		
//		System.out.println("JSON criado");
		
		System.out.println("ACABOU");
	}

}
