package MiniProject;

public class Books {
	int id;
	float price;
	String bookName;
	
	public Books(int id,float price, String bookName) {
		 
		this.id=id;
		this.price = price;
		this.bookName = bookName;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
}
