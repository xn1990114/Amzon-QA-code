package onlineReaderSystem;

public class Page {
	private int bookID;
	private int pageNum;
	private String content;
	
	public int getBookID(){
		return this.bookID;
	}
	public int getPageNum(){
		return this.pageNum;
	}
	
	public void display(){
		System.out.println(this.content);
	}
}
