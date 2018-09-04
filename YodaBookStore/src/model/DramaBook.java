package model;

public class DramaBook extends Book {

	private static final long serialVersionUID = 1L;
	private String typeCover = TypeCover.HARDCOVER.typeCover;
	
	public DramaBook(int isbn, String name, float value, int qttStock) {
		super(isbn, name, value, qttStock);
	}

	public String getTypeCover() {
		return typeCover;
	}
}
