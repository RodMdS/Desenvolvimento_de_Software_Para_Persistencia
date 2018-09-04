package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import controller.ControllerBookStore;
import controller.ControllerClients;
import model.BookStore;
import model.Client;

public class Main {

	private static Scanner scan;
	private static boolean test = true;

	public static void main(String[] args) {
		BookStore bs = new BookStore(1000);
		ControllerBookStore cbs = new ControllerBookStore(bs);
		ControllerClients cc = new ControllerClients();

		scan = new Scanner(System.in);

		while(test){
			System.out.println("---- Yoda\'s Book Store ----");
			System.out.println("1 - Check out total money  |");
			System.out.println("2 - Check book stock       |");
			System.out.println("3 - Add new books          |");
			System.out.println("4 - Sell Book              |");
			System.out.println("5 - Add new client         |");
			System.out.println("6 - Remove a client        |");
			System.out.println("0 - Exit                   |");
			System.out.println("---------------------------");

			System.out.println("Enter the option code to perform the option");
			int codOption = scan.nextInt();

			switch(codOption){
			case 0:
				// Exit
				System.out.println("Goodbye, Yoda...\n");
				test = false;
				break;
				
			case 1:
				// check out total money
				System.out.println("Yoda, you have R$ " + cbs.checkOutTotalMoney() + " in cash.\n");
				break;
				
			case 2: // check book stock
				cbs.checkBookStock();
				System.out.println();
				break;
				
			case 3: // add new books
				System.out.println("Type it the type of books: ");
				String type = scan.next();
				System.out.println("Type it the name of the book: ");
				String bkName = scan.next();
				System.out.println("Type it the price of this book: ");
				float bkValue = scan.nextFloat();
				System.out.println("Type it the quantity of this book: ");
				int bkQuantity = scan.nextInt();

				if(cbs.addNewBooks(bkName, bkValue, bkQuantity, type))
					System.out.println("Purchased successfully.\n");
				else System.out.println("Purchase made unsuccessful.\n");

				break;
				
			case 4: // sell book
				cbs.checkBookStock();
				System.out.println();

				System.out.println("Type it the desired book code: ");
				int bkCode = scan.nextInt();
				System.out.println("Type it the desired quantity of this book: ");
				int bkQtt = scan.nextInt();
				System.out.println("Type it the CPF's client: ");
				String cpfClient = scan.next();

				if(cbs.sellBook(bkCode, bkQtt, cpfClient))
					System.out.println("Sale made successfully.\n");
				else System.out.println("Sale made unsuccessful.\n");
				
				break;
			
			case 5: // add new client
				System.out.println("Type it the client's cpf: ");
				String cpf = scan.next();
				System.out.println("Type it the client's name: ");
				String name = scan.next();
				System.out.println("Type it the client's address: ");
				String address = scan.next();
				System.out.println("Type it the client's birthday: ");
				String data = scan.next();

				try {
					DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
					Date birthday = df.parse(data);
					
					if(cc.addClients(new Client(name, cpf, address, birthday)))
						System.out.println("Client added successfully.\n");
					else System.out.println("Client unsuccessful added.\n");
				} catch (ParseException e) {
					System.out.println("Something unexpected happened. Try again later.");
				}
				
				break;
				
			case 6: // remove a client
				System.out.println("Type it the client's cpf: ");
				String cpfClient1 = scan.next();
				
				if(cc.removeClients(cpfClient1))
					System.out.println("Client successfully removed.\n");
				else System.out.println("Client unsuccessful removed.\n");
				
				break;

			default:
				System.out.println("This option doesn't exists. Try again...\n");
				break;
			}
		}
	}
}