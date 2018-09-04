package model;

public class BookSale {

	private Book book;
	private int qttBook;
	private Client client;
	
	public BookSale(Book book, int qttBook, Client client){
		this.book = book;
		this.qttBook = qttBook;
		this.client = client;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getQttBook() {
		return qttBook;
	}

	public void setQttBook(int qttBook) {
		this.qttBook = qttBook;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return book.getIsbn() + "," + qttBook + "," + client.getCpf();
	}
	
	
}
