package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Client;

public class ClientRepository {
	
	private final String CLIENTS = "/home/rodmds/eclipse-workspace/YodaBookStore/save/clients.txt";
	
	private List<Client> getClients() {
		List<Client> clients = new ArrayList<>();
		
		try {
			InputStream is = new FileInputStream(CLIENTS);
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			while(br.ready()) {
				String linha = br.readLine();
				String[] aux = linha.split(",");
				
				Date date = new Date(Long.parseLong(aux[3]));
				clients.add(new Client(aux[1], aux[0], aux[2], date));
			}
			
			br.close();
			isr.close();
			is.close();
			
			return clients;
		} catch (IOException e) {
			System.out.println("Something unexpected happened. Try again later.");
		}
		
		return clients;
	}
	
	private boolean addAll(List<Client> clients) {
		try {
			OutputStream os = new FileOutputStream(CLIENTS);
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			for(Client c : clients) bw.write(c.toString());
			
			bw.close();
			osw.close();
			os.close();
			
			return true;
		} catch (IOException e) {
			System.out.println("Something unexpected happened. Try again later.");
		}
		
		return false;
	}
	
	public Client getClientByCPF(String cpf) {
		List<Client> clients = this.getClients();
		
		for(Client c : clients) {
			if(c.getCpf().equals(cpf)) return c;
		}
		
		return null;
	}
	
	public boolean addClient(Client client) {
		List<Client> clients = this.getClients();
		
		if(!clients.contains(client)) clients.add(client);
		else {
			System.out.println("Client already registered.");
			return false;
		}
		
		return (this.addAll(clients));
	}
	
	public boolean removeCLient(String cpf) {
		List<Client> clients = this.getClients();
		
		for(int i = 0; i < clients.size(); i++) {
			if(this.getClientByCPF(cpf).getCpf().equals(clients.get(i).getCpf())) {
				clients.remove(i);
			}
		}
		
		File file = new File(CLIENTS);
		if(file.exists()) {
			file.delete();
		}
		
		return this.addAll(clients);
	}
	
}
