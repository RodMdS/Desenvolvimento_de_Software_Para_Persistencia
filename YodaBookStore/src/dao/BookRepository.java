package dao;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.BookSale;
import model.Client;

public class BookRepository {

	private final String BOOKSTOCK = "/home/rodmds/eclipse-workspace/YodaBookStore/save/bookStock.txt";
	private final String BOOKSALES = "/home/rodmds/eclipse-workspace/YodaBookStore/save/bookSales.txt";

	public List<Book> getBookStock() {
		List<Book> stock = new ArrayList<Book>();

		try {
			FileInputStream is = new FileInputStream(BOOKSTOCK);
			
			while(true) {
				ObjectInputStream ois = new ObjectInputStream(is);
				Book b = (Book) ois.readObject();
				stock.add(b);
				System.out.println(b);
			}
		}  catch (EOFException e2) {
			//System.out.println(stock.size()); //return stock;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Something unexpected happened. Try again later. (stock)");
		}

		System.out.println(stock.size());
		return stock;
	}
	
	public boolean saveAll(List<Book> stock) {
		try {
			File file = new File(BOOKSTOCK);
			if(file.exists()) file.delete();
			
			FileOutputStream os = new FileOutputStream(BOOKSTOCK, true);
			ObjectOutputStream oos = new ObjectOutputStream(os);

			for(Book b : stock) oos.writeObject(b);

			oos.close();
			os.close();

			return true;
			
		} catch (IOException e) {
			System.out.println("Something unexpected happened. Try again later. (SaveAll)");
		}

		return false;
	}

	public boolean save(Book book) {
		List<Book> stock = this.getBookStock();
		
		if(!stock.contains(book)) stock.add(book);
		else {
			for(Book b : stock) {
				if(b.getIsbn() == book.getIsbn()) {
					b.setQttStock(b.getQttStock() + book.getQttStock());
				}
			}
		}
		
		return this.saveAll(stock);
	}

	private boolean addSale(BookSale bs) {
		try {
			OutputStream os = new FileOutputStream(BOOKSALES);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);

			bw.write(bs.toString());

			bw.close();
			osw.close();
			os.close();

			return true;
		} catch (IOException e) {
			System.out.println("Something unexpected happened. Try again later.");
		}

		return false;
	}

	public boolean sell(int isbn, int bkQuantity, Client c) {
		List<Book> stock = this.getBookStock();

		for(Book b : stock) {
			if(b.getIsbn() == isbn) {
				int newQtt = b.getQttStock() - bkQuantity;
				if(newQtt >= 0){
					b.setQttStock(newQtt);
					return (this.saveAll(stock) && this.addSale(new BookSale(b, bkQuantity, c)));
				}
			}
		}

		return false;
	}

}
