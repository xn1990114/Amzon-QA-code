package onlineReaderSystem;

import java.util.*;

public class Library {
	private Map<Integer,Book> books;
	
	public Library(){
		this.books=new HashMap<Integer,Book>();
	}
	public Map<Integer,Book> listBooks(){
		return this.books;
	}
	
	public Book getBook(int bookId){
		return books.get(bookId);
	}
	
	public void addBook(Book b){
		if(this.books.keySet().contains(b.getBookId())){
			System.out.println("Book ID already exist");
			return;
		}
		books.put(b.getBookId(), b);
	}
	public void removeBook(Book b){
		if(!this.books.keySet().contains(b.getBookId())){
			System.out.println("Book ID does NOT exist");
			return;
		}
		books.remove(b.getBookId());
	}
	
}
