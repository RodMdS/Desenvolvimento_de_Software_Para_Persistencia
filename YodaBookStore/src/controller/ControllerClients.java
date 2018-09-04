package controller;

import dao.ClientRepository;
import model.Client;

public class ControllerClients {
	
	private ClientRepository cr;
	
	public ControllerClients() {
		cr = new ClientRepository();
	}
	
	public boolean addClients(Client client) {
		return cr.addClient(client);
	}
	
	public Client getClientByCpf(String cpf) {
		return cr.getClientByCPF(cpf);
	}
	
	public boolean removeClients(String cpf) {
		return cr.removeCLient(cpf);
	}

}
