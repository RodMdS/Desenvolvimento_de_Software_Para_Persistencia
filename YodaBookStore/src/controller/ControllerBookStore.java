package controller;

import java.util.List;

import dao.BookRepository;
import dao.ClientRepository;
import model.AdventureBook;
import model.Book;
import model.BookStore;
import model.Client;
import model.ComedyBook;
import model.DramaBook;

public class ControllerBookStore {
	
	private BookStore bs;
	private BookRepository br = new BookRepository();
	private ClientRepository cr = new ClientRepository();
	
	public ControllerBookStore(BookStore bs){
		this.bs = bs;
	}
	
	public float checkOutTotalMoney(){
		return bs.getTotalMoney();
	}
	
	public void checkBookStock() {
//		for(Book bk : br.getBookStock()){
//			System.out.println(bk.toString());
//		}
		br.getBookStock();
	}
	
	public boolean addNewBooks(int isbn, String bkName, float bkValue, int bkQuantity, String type) {
		float aux = bs.getTotalMoney() - (bkValue * bkQuantity);
		if(aux >= 0){
			List<Book> stock = br.getBookStock();
			for(Book bk : stock){
				if(bk.getName().equals(bkName)){
					bk.setQttStock(bk.getQttStock() + bkQuantity);
					bs.setTotalMoney(aux);
					return br.saveAll(stock);
				}
			}
			if(type.equals("Adventure")) br.save(new AdventureBook(isbn, bkName, bkValue, bkQuantity));
			else if(type.equals("Drama")) br.save(new DramaBook(isbn, bkName, bkValue, bkQuantity));
			else br.save(new ComedyBook(isbn, bkName, bkValue, bkQuantity));
			
			bs.setTotalMoney(aux);
			return true;
		}
		return false;
	}
	
	public boolean sellBook(int isbn, int bkQuantity, String cpfCLient) {
		List<Book> stock = br.getBookStock();
		for(Book bk : stock){
			if((bk.getIsbn() == isbn)){
				bs.setTotalMoney(bs.getTotalMoney() + (bk.getValue() * bkQuantity));
				Client c = cr.getClientByCPF(cpfCLient);
				return br.sell(isbn, bkQuantity, c);
			}
		}
		return false;
	}
	
}
