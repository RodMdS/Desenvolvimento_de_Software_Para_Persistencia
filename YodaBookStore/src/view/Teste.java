package view;

import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import controller.ControllerClients;
import model.Client;

public class Teste {

	private static Scanner leitor;

	public static void main(String[] args) throws ParseException, IOException {
		ControllerClients cc = new ControllerClients();
		
		leitor = new Scanner(System.in);
		
		System.out.println("CPF: ");
		String cpf = leitor.nextLine();
		System.out.println("Nome: ");
		String nome = leitor.nextLine();
		System.out.println("Endereço: ");
		String address = leitor.nextLine();
		System.out.println("Data: ");
		String data = leitor.nextLine();

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = df.parse(data);
		
		Client c = new Client(nome, cpf, address, date);
		
	    cc.addClients(c);
	    
	    Date dia = new Date(Long.parseLong(c.toString().split(",")[3]));
	    
	    System.out.println(dia.toString());
	}

}
