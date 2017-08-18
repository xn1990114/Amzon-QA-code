package onlineReaderSystem;

import java.util.Set;

public class ControlPanel {
	private User currUser;
	private Library lib;
	private Set<User> users;
	
	public ControlPanel(Library lib,Set<User> users){
		currUser=null;
		this.lib=lib;
		this.users=users;
	}
	
	public void userLogin(int userId){
		for(User u:users){
			if(u.getUserId()==userId){
				this.currUser=u;
				display();
				return;
			}
		}
		System.out.println("User is not Registered");
	}
	
	public void userLogoff(){
		currUser=null;
	}
	
	public void display(){
		if(currUser==null){
			System.out.println("User must log in first");
		}
		if(currUser.getActiveBookId()==-1){
			System.out.println("No active book, please select any book from lib");
			return ;
		}
		lib.getBook(currUser.getActiveBookId()).getPages().get(currUser.getActivePageNum());
	}
	public void next(){
		if(currUser==null){
			System.out.println("User must log in first");
		}
		int pageNum=currUser.getActivePageNum();
		if(pageNum>=lib.getBook(currUser.getActiveBookId()).getPages().size()-1){
			System.out.println("This is the last page already");
			return;
		}
		currUser.setActivePageNum(pageNum+1);
		display();
	}
	public void previous(){
		if(currUser==null){
			System.out.println("User must log in first");
		}
		int pageNum=currUser.getActivePageNum();
		if(pageNum==0){
			System.out.println("This is the first page already");
			return;
		}
		currUser.setActivePageNum(pageNum-1);
		display();
	}
	
	public void goToPage(int pageNum){
		currUser.setActivePageNum(pageNum);
		display();
	}
	
	public void selectBook(int bookId){
		if(currUser==null){
			System.out.println("User must log in first");
		}
		currUser.setActiveBookId(bookId);
		currUser.setActivePageNum(0);
		display();
	}
	
}
