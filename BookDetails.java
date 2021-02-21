package OopsAssignment;
class Book
{
	// private data members
	private int bookNo;
	private String title;
	private String author;
	private float price;
	// public getter and setter methods
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}	
} 
class EngineeringBook extends Book{
	private String category;

	public String getCategory() {
		return category;
	}
  public void setCategory(String category) {
		this.category = category;
	}	
  void func() {
	  System.out.println("category is " + category );
  }
}
public class BookDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Book book=new Book();
	book.setBookNo(5678);
	book.setTitle("The Persuit of Happiness");
	book.setAuthor("xyz");
	book.setPrice(150);
	EngineeringBook engibook=new EngineeringBook();
	engibook.setCategory("novel");
	System.out.println("Book Number is " + book.getBookNo()); 
	System.out.println("Title of book is " + book.getTitle());
	System.out.println("Author of book is " + book.getAuthor());
	System.out.println("Price of book is " + book.getPrice());
	System.out.println("The category is " + engibook.getCategory());
	}
}