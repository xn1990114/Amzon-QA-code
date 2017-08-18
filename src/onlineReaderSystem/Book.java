package onlineReaderSystem;

import java.util.*;

public class Book {
	private int bookId;
	private String bookName;
	private List<Page> pages;
	
	public Book(String name,int id,List<Page> pages){
		this.bookName=name;
		this.bookId=id;
		this.pages=pages;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public List<Page> getPages() {
		return pages;
	}
	
	
}
