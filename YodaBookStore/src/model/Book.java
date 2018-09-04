package model;

import java.io.Serializable;

public abstract class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int isbn;
	private String name;
	private float value;
	private int qttStock;
	
	public Book(int isbn, String name, float value, int qttStock){
		this.isbn = isbn;
		this.name = name;
		this.value = value;
		this.qttStock = qttStock;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public int getQttStock() {
		return qttStock;
	}

	public void setQttStock(int qttStock) {
		this.qttStock = qttStock;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", value=" + value + ", qttStock=" + qttStock + "]";
	}
	
	
	
}
