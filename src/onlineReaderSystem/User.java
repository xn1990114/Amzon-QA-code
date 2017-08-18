package onlineReaderSystem;

public class User {
	private int userId;
	private int activeBookId;
	private int activePageNum;
	
	public User(int id){
		this.userId=id;
		this.activeBookId=-1;
		this.activePageNum=0;
	}
	
	public int getUserId(){
		return this.userId;
	}
	public int getActiveBookId(){
		return this.activeBookId;
	}
	public int getActivePageNum(){
		return this.activePageNum;
	}
	public void setActiveBookId(int bookId){
		this.activeBookId=bookId;
	}
	public void setActivePageNum(int pageNum){
		this.activePageNum=pageNum;
	}
	
	
}
