package blackJack;

import java.util.*;

public class Hand {
	private int playerID;
	private List<Card> hold;
	public Hand(int id){
		this.playerID=id;
		this.hold=new ArrayList<Card>();
	}
	
	public void draw(Card card){
		this.hold.add(card);
	}
	
	public int getTotal(){
		int countAce=0;
		int total=0;
		for(int i=0;i<this.hold.size();i++){
			if(hold.get(i).getNumber()==1){
				total=total+11;
				countAce++;
			}
			else if(hold.get(i).getNumber()>=10){
				total=total+10;
			}
			else{
				total=total+hold.get(i).getNumber();
			}
		}
		while(total>21&&countAce>0){
			total=total-10;
			countAce--;
		}
		return total>21?0:total;
	}
	public int getPlayerID(){
		return this.playerID;
	}
	public List<Card> getHold(){
		return this.hold;
	}
	
	public void printInfo(){
		System.out.println("Player "+this.playerID+" is winner with "+this.getTotal()+ " points");
	}
	
}
