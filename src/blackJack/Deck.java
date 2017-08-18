package blackJack;

import java.util.*;

public class Deck {
	List<Card> cards;
	public Deck(){
		this.cards=new ArrayList<Card>();
		for(int i=1;i<=13;i++){
			for(int j=Card.Club;j<=Card.Spade;j++){
				this.cards.add(new Card(j,i));
			}
		}
	}
	
	public void shuffle(){
		int max=this.cards.size();
		while(max>0){
			int pos=new Random().nextInt(max);
			int curr=max-1;
			Card last=cards.get(curr);
			cards.set(curr, cards.get(pos));
			cards.set(pos, last);
			max--;
		}
	}
	
	public Card draw(){
		int pos=cards.size()-1;
		Card card=this.cards.get(pos);
		cards.remove(pos);
		return card;
	}
}
