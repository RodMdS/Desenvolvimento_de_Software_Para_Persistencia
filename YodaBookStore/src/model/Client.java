package model;

import java.util.Date;

public class Client {
	
	private String name;
	private String cpf;
	private String address;
	private Date birthday;
	
	public Client(String name, String cpf, String address, Date birthday) {
		this.name = name;
		this.cpf = cpf;
		this.address = address;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return cpf + "," + name + "," + address + "," + birthday.getTime() + "\n";
	}

}
