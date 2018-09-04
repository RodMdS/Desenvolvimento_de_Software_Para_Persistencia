package model;

public class ComedyBook extends Book {

	private static final long serialVersionUID = 1L;
	private String typeCover = TypeCover.BOOKLETCOVER.typeCover;
	
	public ComedyBook(int isbn, String name, float value, int qttStock) {
		super(isbn, name, value, qttStock);
	}

	public String getTypeCover() {
		return typeCover;
	}
}
