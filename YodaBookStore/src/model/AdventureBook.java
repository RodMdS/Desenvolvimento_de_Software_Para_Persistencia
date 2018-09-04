package model;

import java.util.ArrayList;
import java.util.List;

public class AdventureBook extends Book {
	
	private static final long serialVersionUID = 1L;
	private List<String> illustrations;

	public AdventureBook(String name, float value, int qttStock) {
		super(name, value, qttStock);
		this.illustrations = new ArrayList<String>();
	}

	public List<String> getIllustrations() {
		return illustrations;
	}

	public void setIllustrations(List<String> illustrations) {
		this.illustrations = illustrations;
	}

}
